package com.cloud.service;

import com.cloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cai
 * @version 1.0
 * @date 2020/8/11 10:45
 */
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT")
@Component
public interface FeignDeptClientService {
    @GetMapping("/dept/{id}")
    Dept getDeptById(@PathVariable("id") Integer id);


    @GetMapping("/dept")
    List<Dept> getDepts();

    @PostMapping("/dept")
    int insertDept(@RequestBody Dept dept);

    @DeleteMapping("/dept/{id}")
    int deleteDept(@PathVariable("id") Integer id);

    @PutMapping("/dept")
    int updateDept(@RequestBody Dept dept);
}
