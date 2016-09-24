package com.xlinyu.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gavin on 24/09/2016.
 */
@Controller
@RequestMapping("/cms")
public class CmsArticleController {

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public String article(){

        return "cms/article/article_list";
    }
}
