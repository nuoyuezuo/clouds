package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//开启zuul
public class SpringcloudZuul9200Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuul9200Application.class, args);
    }

}
