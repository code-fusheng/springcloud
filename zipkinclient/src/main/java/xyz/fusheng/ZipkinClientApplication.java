package xyz.fusheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @FileName: ZipkinClientApplication
 * @Author: code-fusheng
 * @Date: 2020/5/29 0:58
 * @version: 1.0
 * Description:
 */

@SpringBootApplication
public class ZipkinClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class,args);
    }
}
