package xyz.fusheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xyz.fusheng.entity.Student;

import java.util.Collection;

/**
 * @FileName: Ribbonhandler
 * @Author: code-fusheng
 * @Date: 2020/5/27 15:42
 * @version: 1.0
 * Description: Ribbon控制器
 */

@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }

    @GetMapping("/getPort")
    public String index(){
        return restTemplate.getForObject("http://provider/student/getPort",String.class);
    }

    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable Integer num1, @PathVariable Integer num2 ){
        return restTemplate.getForObject("http://provider/student/add/"+ num1 + "/" + num2, String.class,num1,num2);
        // return restTemplate.getForObject("http://provider/calculate/add/{num1}/{num2}", String.class,num1,num2);
    }

}
