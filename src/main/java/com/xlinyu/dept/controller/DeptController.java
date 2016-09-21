package com.xlinyu.dept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gavin on 21/09/2016.
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String deptIndex(){

        return "dept/dept_index";
    }

}
