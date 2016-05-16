package com.transation.dao;

import com.transation.model.Fruit;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/28.
 */
public interface DemoDAO {
    public int insert(Fruit fruit);

    public int delete(Fruit fruit);

    public List<Fruit> select(Fruit fruit);

    public int updata(@Param(value = "map")Map map);
}
