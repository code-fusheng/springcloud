package xyz.fusheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @FileName: EurekaServerApplication
 * @Author: code-fusheng
 * @Date: 2020/5/21 23:42
 * @version: 1.0
 * Description: Eureka服务启动类
 * 1、@SpringBootApplication：声明该类是 Spring Boot 服务的入口。
 * 2、@EnableEurekaServer：声明该类是一个 Eureka Server 微服务，提供服务注册和服务发现功能，即注册中心。
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
