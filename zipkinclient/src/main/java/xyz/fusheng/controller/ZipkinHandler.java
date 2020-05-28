package xyz.fusheng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: ZipkinHandler
 * @Author: code-fusheng
 * @Date: 2020/5/29 0:59
 * @version: 1.0
 * Description:
 */

@RestController
@RequestMapping("/zipkin")
public class ZipkinHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort(){
        return this.port;
    }

}
