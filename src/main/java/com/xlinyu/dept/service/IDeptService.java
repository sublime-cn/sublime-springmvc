package com.xlinyu.dept.service;

import com.xlinyu.dept.model.Dept;

import java.util.List;

/**
 * Created by gavin on 25/09/2016.
 */
public interface IDeptService {

    int deleteByPrimaryKey(String id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    public List<Dept> listDept(String pid);

    public List<Dept> pdetp(String pid);

}
