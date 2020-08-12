package com.cloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableHystrixDashboard//Dashboard开启监控页面
public class SpringcloudConsumerHystrixDashboard9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerHystrixDashboard9001Application.class, args);
    }


}
