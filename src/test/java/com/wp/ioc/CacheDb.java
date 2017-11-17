package com.wp.ioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 王萍 on 2017/11/17 0017.
 */
@Component
public class CacheDb<K, V> {

    private Map<K, V> db;

    {
        db = new ConcurrentHashMap<K, V>();
    }

    public void insert(K id, V object) {
        db.put(id, object);
    }

    public void delete(K id) {
        db.remove(id);
    }

    public V select(K id) {
        return db.get(id);
    }
}
