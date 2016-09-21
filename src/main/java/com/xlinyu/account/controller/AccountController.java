package com.xlinyu.account.controller;

import com.xlinyu.account.model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gavin on 20/09/2016.
 */
@Controller
@RequestMapping("/account")
public class AccountController {


    private static final Logger logger = Logger.getLogger(AccountController.class);

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin(){
        return "account/signin";

    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String login(User user){
        logger.info(user);
        return "redirect:/";

    }




    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(){

        return "account/signup";

    }

}
