package xyz.fusheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @FileName: ZuulApplication
 * @Author: code-fusheng
 * @Date: 2020/5/22 15:47
 * @version: 1.0
 * Description: Zuul 服务网关启动类
 * 1、@EnableZuulProxy 开启网关代理 包含了 `@EnableZuulServer`，设置该类是网关的启动类。
 * 2、@EnableAutoConfiguration 配置自动装载的方式 可以帮助 Spring Boot 应用将所有符合条件的 `@Configuration`
 *   配置加载到当前 Spring Boot 创建并使用的 IoC 容器中。
 */

@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
