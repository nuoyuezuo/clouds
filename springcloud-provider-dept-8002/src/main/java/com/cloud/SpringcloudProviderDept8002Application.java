package com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cloud.mapper")//扫描mapper接口
public class SpringcloudProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderDept8002Application.class, args);
    }

}
