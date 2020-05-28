package xyz.fusheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @FileName: NativaConfigServerApplication
 * @Author: code-fusheng
 * @Date: 2020/5/28 14:51
 * @version: 1.0
 * Description:
 * 1、@EnableConfigServer：声明配置中心
 */

@SpringBootApplication
@EnableConfigServer
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class, args);
    }
}
