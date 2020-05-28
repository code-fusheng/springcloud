package xyz.fusheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @FileName: RibbonApplication
 * @Author: code-fusheng
 * @Date: 2020/5/27 15:35
 * @version: 1.0
 * Description: ribbon 负载均衡启动类
 * 1、@LoadBalanced 声明基于Ribbon的负载均衡 默认轮询
 */

@SpringBootApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
