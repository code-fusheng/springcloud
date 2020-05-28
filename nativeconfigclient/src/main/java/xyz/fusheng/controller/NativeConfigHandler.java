package xyz.fusheng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: NativeConfigHandler
 * @Author: code-fusheng
 * @Date: 2020/5/28 15:36
 * @version: 1.0
 * Description:
 */

@RestController
@RequestMapping("/native")
public class NativeConfigHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/getPort")
    public String getPort(){
        return this.port+"-"+this.foo;
    }

}
