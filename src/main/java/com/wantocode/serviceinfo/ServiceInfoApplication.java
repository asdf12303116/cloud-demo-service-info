package com.wantocode.serviceinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author a6757
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceInfoApplication.class, args);
    }

}
