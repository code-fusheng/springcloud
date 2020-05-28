package xyz.fusheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @FileName: HystrixApplication
 * @Author: code-fusheng
 * @Date: 2020/5/28 13:35
 * @version: 1.0
 * Description:
 * 1、@EnableCircuitBreaker 声明启用数据监控
 * 2、@EnableHystrixDashboard 声明启用可视化数据监控
 */

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}
