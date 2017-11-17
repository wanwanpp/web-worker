package com.wp.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by 王萍 on 2017/11/17 0017.
 */
public class PropertiesLoader {

    private static final Logger logger = LoggerFactory.getLogger(PropertiesLoader.class);


    /**
     * 加载properties文件。
     *
     * @param fileName
     * @return
     */
    public static Properties loadProperties(String fileName) {
        if (StringUtils.isEmpty(fileName)) {
            throw new IllegalArgumentException("properties文件的路径不能为空");
        }
        Properties properties = new Properties();
        InputStream is = null;

        try {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if (is != null) {
                properties.load(is);
            }
        } catch (IOException e) {
            logger.error("属性文件加载出错", e);
            throw new RuntimeException(e);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                logger.error("关闭资源出错");
            }
        }

        return properties;
    }
}
