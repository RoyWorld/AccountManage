package com.transation.service;

import com.transation.model.Fruit;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/28.
 */
public interface DemoService {
    public int insert(Fruit fruit);

    public int delete(Fruit fruit);

    public List<Fruit> select(Fruit fruit);

    public int updata(Map map);

}
