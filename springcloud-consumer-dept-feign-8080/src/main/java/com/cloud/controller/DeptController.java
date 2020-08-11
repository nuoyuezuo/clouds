package com.cloud.controller;

import com.cloud.pojo.Dept;
import com.cloud.service.FeignDeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cai
 * @version 1.0
 * @date 2020/8/11 11:47
 */

@RestController
public class DeptController {

    // 注入springcloud-api中的 service 接口
    // @Autowired(required=true)
    @Autowired(required = true)
    FeignDeptClientService feignDeptClientService = null;

    @GetMapping("/consumer/dept/{id}")
    public Dept getDeptById(@PathVariable("id") Integer id) {
        return feignDeptClientService.getDeptById(id);
    }

    @GetMapping("/consumer/dept")
    public List<Dept> getDepts() {
        return this.feignDeptClientService.getDepts();
    }

    @PostMapping("/consumer/dept")
    public int insertDept(@RequestBody Dept dept) {
        return feignDeptClientService.insertDept(dept);
    }

    @DeleteMapping("/consumer/dept/{id}")
    public void deleteDept(@PathVariable("id") Integer id) {
        feignDeptClientService.deleteDept(id);
    }

    @PutMapping("/consumer/dept")
    public void updateDept(@RequestBody Dept dept) {
        feignDeptClientService.updateDept(dept);
    }
}
