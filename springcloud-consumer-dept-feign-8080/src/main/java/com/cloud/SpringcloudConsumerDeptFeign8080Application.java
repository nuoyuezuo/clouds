package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableFeignClients(basePackages = {"com.cloud"})
//@ComponentScan("com.cloud")
public class SpringcloudConsumerDeptFeign8080Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerDeptFeign8080Application.class, args);
    }

}
