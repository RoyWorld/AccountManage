package com.view.controller;


import com.transation.model.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2015/11/25.
 */
@Controller
@RequestMapping(value="test")
public class TestController {

    @Autowired
    com.transation.service.DemoService demoService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        return "/test";
    }

    @ResponseBody
    @RequestMapping(value = "/returnjson", method = RequestMethod.GET)
    public Object returnJson() {
//        JSONArray jsonArray = new JSONArray();
        Fruit apple = new Fruit();
        apple.setName("apple");
        apple.setPrice("12");
        apple.setCountry("China");
        Fruit banana = new Fruit();
        banana.setName("banana");
        banana.setPrice("14");
        banana.setCountry("Afrian");
        List list = new ArrayList();
        list.add(apple);
        list.add(banana);
//        list.add(watermelon);
//        Bizdate bizdate = new Bizdate();
//        bizdate.setRows(list);
//        return  bizdate;
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/insertFruit", method = RequestMethod.POST)
    public Object testDAO(@RequestBody Fruit fruit) {
        try {
            int i = demoService.insert(fruit);
            return i;
        } catch (Exception e) {
            throw e;
        }
    }


}


