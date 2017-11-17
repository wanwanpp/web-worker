package com.wp.utils;

/**
 * Created by 王萍 on 2017/11/17 0017.
 */
public class StringUtils {

    public static boolean NotEmpty(String s) {
        return !isEmpty(s);
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
}
