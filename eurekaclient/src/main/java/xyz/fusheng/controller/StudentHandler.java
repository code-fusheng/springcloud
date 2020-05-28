package xyz.fusheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.entity.Student;
import xyz.fusheng.repository.StudentRepository;

import java.util.Collection;

/**
 * @FileName: StudentHandler
 * @Author: code-fusheng
 * @Date: 2020/5/22 9:59
 * @version: 1.0
 * Description: Student 控制类
 */

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    /**
     * 服务端口
     */
    @Value("${server.port}")
    private String port;

    /**
     * 打印端口
     * @return
     */
    @GetMapping("/getPort")
    public String getPort() {
        return "当前端口：" + this.port ;
    }

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return studentRepository.findById(id);
    }

    /**
     * 保存
     * @param student
     */
    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    /**
     * 更新
     * @param student
     */
    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    /**
     * 根据id删除
     * @param id
     */
    @DeleteMapping("/deleteById/{id}")
    public void deletedById(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable Integer num1, @PathVariable Integer num2){
        return "result :" + (num1 + num2);
    }

}
