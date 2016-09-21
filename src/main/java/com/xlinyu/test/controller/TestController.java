package com.xlinyu.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gavin on 21/09/2016.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/ftl", method = RequestMethod.GET)
    public String ftl(){
        return "test/hello";
    }

}
