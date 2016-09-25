package com.xlinyu.dept.service.impl;

import com.xlinyu.dept.dao.DeptMapper;
import com.xlinyu.dept.model.Dept;
import com.xlinyu.dept.service.IDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * Created by gavin on 25/09/2016.
 */
@Service
public class DeptService implements IDeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Dept record) {
        return 0;
    }

    @Override
    public int insertSelective(Dept record) {

        if(record != null){
            record.setId(UUID.randomUUID().toString());
        }

        return deptMapper.insertSelective(record);
    }

    @Override
    public Dept selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return 0;
    }

    @Override
    public List<Dept> listDept(String pid) {
        return deptMapper.listDept(pid);
    }

    @Override
    public List<Dept> pdetp(String pid) {
        return deptMapper.pdetp(pid);
    }
}
