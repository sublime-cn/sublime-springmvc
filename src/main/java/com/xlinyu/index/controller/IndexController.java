package com.xlinyu.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gavin on 20/09/2016.
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/","/home"})
    public String home(){

        return "home";
    }

}
