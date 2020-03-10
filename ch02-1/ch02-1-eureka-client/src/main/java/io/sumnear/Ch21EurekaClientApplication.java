package io.sumnear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: sumnear
 * @date: 2020-03-10 22:51
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch21EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch21EurekaClientApplication.class, args);
    }
}
