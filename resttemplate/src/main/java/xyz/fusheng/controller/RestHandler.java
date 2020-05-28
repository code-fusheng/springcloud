package xyz.fusheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import xyz.fusheng.entity.Student;

import java.util.Collection;

/**
 * @FileName: RestHandler
 * @Author: code-fusheng
 * @Date: 2020/5/22 13:47
 * @version: 1.0
 * Description: RestTemplate 控制处理器
 */

@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过RestTemplate 调用服务接口
     * 前者返回封装后的类型，后者直接返回泛型实体类对象
     * @return
     */
    @GetMapping("/findAll1")
    public Collection<Student> findAll1() {
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }
    @GetMapping("/findAll2")
    public Collection<Student> findAll2() {
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping("/findById1/{id}")
    public Student findById1(@PathVariable("id") long id) {
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
    }
    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id") long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }

    /**
     * 保存
     * @param student
     */
    @PostMapping("/save1")
    public void save1(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save",student,null).getBody();
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,Object.class);
    }

    /**
     * 更新
     * @param student
     */
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }

    /**
     * 删除
     * @param id
     */
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }

}
