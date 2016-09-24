package com.xlinyu.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gavin on 24/09/2016.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public String list(){

        return "user/user_list";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String userAdd(){

        return "user/user_add";
    }

}
