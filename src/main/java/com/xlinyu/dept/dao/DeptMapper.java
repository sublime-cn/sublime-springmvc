package com.xlinyu.dept.dao;

import com.xlinyu.dept.model.Dept;

import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(String id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    public List<Dept> listDept(String pid);

    public List<Dept> pdetp(String pid);
}