package com.transation.service.impl;

import com.transation.dao.DemoDAO;
import com.transation.model.Fruit;
import com.transation.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/28.
 */
@Service("DemooServiceImpl")
public class DemooServiceImpl implements DemoService {

    @Autowired
    DemoDAO demoDAO;

    @Override
    public int insert(Fruit fruit) {
        return demoDAO.insert(fruit);
    }

    @Override
    public int delete(Fruit fruit) {
        return demoDAO.delete(fruit);
    }

    @Override
    public List<Fruit> select(Fruit fruit) {
        return demoDAO.select(fruit);
    }

    @Override
    public int updata(Map map) {
        return updata(map);
    }


}
