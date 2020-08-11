package com.cloud.controller;

import com.cloud.pojo.Dept;
import com.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cai
 * @version 1.0
 * @date 2020/8/10 13:56
 */
@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @GetMapping("/dept/{id}")
    public Dept getDeptById(@PathVariable("id") Integer id) {
        return deptService.getDeptById(id);
    }

    @GetMapping("/dept")
    public List<Dept> getDepts() {
        return deptService.getDepts();
    }

    @PostMapping("/dept")
    public int insertDept(@RequestBody Dept dept) {
        return deptService.insertDept(dept);
    }

    @DeleteMapping("/dept/{id}")
    public int deleteDept(@PathVariable("id") Integer id) {
        return deptService.deleteDept(id);
    }

    @PutMapping("/dept")
    public int updateDept(@RequestBody Dept dept) {
        return deptService.updateDept(dept);
    }
}
