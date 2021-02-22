package com.heima.leyou.dao;

import java.util.Map;

public interface StorageDao {
    public Map<String, Object> insertStorage(String sku_id, double in_quanty, double out_quanty);
}
