package com.xlinyu.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gavin on 20/09/2016.
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String home(){

        return "home";
    }

}
