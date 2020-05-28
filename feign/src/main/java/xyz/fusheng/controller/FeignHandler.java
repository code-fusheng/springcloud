package xyz.fusheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fusheng.entity.Student;
import xyz.fusheng.feign.FeignProvideClient;

import java.util.Collection;

/**
 * @FileName: FeignHandler
 * @Author: code-fusheng
 * @Date: 2020/5/27 16:20
 * @version: 1.0
 * Description:
 */

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignProvideClient feignProvideClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProvideClient.findAll();
    }

    @GetMapping("/getPort")
    public String getPort(){
        return feignProvideClient.getPort();
    }

}
