package com.zhaoyang.sunmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SunmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunmallMemberApplication.class, args);
    }

}
