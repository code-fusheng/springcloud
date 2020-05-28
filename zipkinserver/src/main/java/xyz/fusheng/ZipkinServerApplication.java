package xyz.fusheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @FileName: ZipkinApplication
 * @Author: code-fusheng
 * @Date: 2020/5/29 0:45
 * @version: 1.0
 * Description:
 * 1、@EnableZipkinServer  声明启动 Zipkin Server
 */

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class,args);
    }
}
