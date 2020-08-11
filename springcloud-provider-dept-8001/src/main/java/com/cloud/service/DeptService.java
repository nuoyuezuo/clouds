package com.cloud.service;

import com.cloud.pojo.Dept;

import java.util.List;

/**
 * @author cai
 * @version 1.0
 * @date 2020/8/10 13:46
 */
public interface DeptService {
    Dept getDeptById(Integer id);

    List<Dept> getDepts();

    int insertDept(Dept dept);

    int deleteDept(Integer id);

    int updateDept(Dept dept);
}
