package com.cloud;

//import com.conf.Rule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient//ribbon和eureka整合以后,客户端可以直接调用,不用关心ip地址和端口号
//@RibbonClient(name = "springcloud-provider-dept",configuration = Rule.class)
@EnableFeignClients(basePackages = {"com.cloud"})
public class SpringcloudConsumerDept8080Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerDept8080Application.class, args);
    }

}
