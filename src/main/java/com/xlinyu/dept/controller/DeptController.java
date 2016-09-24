package com.xlinyu.dept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by gavin on 21/09/2016.
 */
@Controller
public class DeptController {

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public String deptList(HttpServletRequest request){
        return "dept/dept_list";
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.GET)
    public String toAdd(HttpServletRequest request){
        return "dept/dept_add";
    }

}
