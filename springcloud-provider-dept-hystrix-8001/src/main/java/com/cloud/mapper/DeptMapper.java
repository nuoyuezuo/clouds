package com.cloud.mapper;

import com.cloud.pojo.Dept;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cai
 * @version 1.0
 * @date 2020/8/11 17:45
 */
@Repository
public interface DeptMapper {
    Dept getDeptById(@Param("id") Integer id);

    List<Dept> getDepts();

    int insertDept(Dept dept);

    int deleteDept(@Param("id") Integer id);

    int updateDept(Dept dept);
}
