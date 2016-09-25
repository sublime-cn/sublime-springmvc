package com.xlinyu.dept.controller;

import com.xlinyu.dept.model.Dept;
import com.xlinyu.dept.service.IDeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by gavin on 21/09/2016.
 */
@Controller
public class DeptController {

    @Resource
    private IDeptService deptService;

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public String deptList(HttpServletRequest request){
        List<Dept> pdetp = deptService.pdetp("");
        request.setAttribute("pdetp", pdetp);
        return "dept/dept_list";
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.GET)
    public String toAdd(HttpServletRequest request){
        List<Dept> pdetp = deptService.pdetp("");
        request.setAttribute("pdetp", pdetp);
        return "dept/dept_add";
    }


    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public String addDept(Dept dept){

        int i = deptService.insertSelective(dept);
        System.out.println("创建部门: " + i);

        return "redirect:/dept/list";
    }

    @ResponseBody
    @RequestMapping("/dept/tree/{pid}")
    public Object tree(@PathVariable("pid") String pid){
        return deptService.listDept(pid);
    }

    //public Object pDept(@P)

}
