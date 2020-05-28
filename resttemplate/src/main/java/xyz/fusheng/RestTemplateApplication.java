package xyz.fusheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @FileName: RestTemplateApplication
 * @Author: code-fusheng
 * @Date: 2020/5/22 11:34
 * @version: 1.0
 * Description:
 */

@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);
    }

    /**
     * RestTemplate 提供方法 @Bean负责注入到IOC容器
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
