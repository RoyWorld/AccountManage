package com.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/11/27.
 */
//用于指向welcome和error
@Controller
public class defaultPageController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model modle){
        return "hello";
    }


    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public String error(Model modle){
        return "error";
    }
}
