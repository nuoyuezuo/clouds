package com.cloud.service.impl;

import com.cloud.mapper.DeptMapper;
import com.cloud.pojo.Dept;
import com.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cai
 * @version 1.0
 * @date 2020/8/10 13:47
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept getDeptById(Integer id) {
        return deptMapper.getDeptById(id);
    }

    @Override
    public List<Dept> getDepts() {
        return deptMapper.getDepts();
    }

    @Override
    public int insertDept(Dept dept) {
        return deptMapper.insertDept(dept);
    }

    @Override
    public int deleteDept(Integer id) {
        return deptMapper.deleteDept(id);
    }

    @Override
    public int updateDept(Dept dept) {
        return updateDept(dept);
    }
}
