package com.xlinyu.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gavin on 20/09/2016.
 */
@Controller
@RequestMapping("/account")
public class AccountController {


    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin(){

        return "account/signin";

    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(){

        return "account/signup";

    }

}
