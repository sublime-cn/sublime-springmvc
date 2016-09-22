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
@RequestMapping("/dept")
public class DeptController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String deptIndex(HttpServletRequest request){

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            System.out.println(key + "\t -->> " + value);
        }
        request.setAttribute("path", "/sublime");
        return "dept/dept_index";
    }

    @RequestMapping(value = "/adddept", method = RequestMethod.GET)
    public String toAdd(HttpServletRequest request){
        request.setAttribute("path", "/sublime");
        return "dept/dept_add";
    }

}
