package xyz.fusheng.repository.impl;

import org.springframework.stereotype.Repository;
import xyz.fusheng.entity.Student;
import xyz.fusheng.repository.StudentRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @FileName: StudentRepositoryImpl
 * @Author: code-fusheng
 * @Date: 2020/5/22 9:49
 * @version: 1.0
 * Description: Student 业务逻辑接口实现类
 */

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    /**
     * 临时存储媒介
     */
    private Map<Long, Student> studentMap;

    public StudentRepositoryImpl(){
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 21));
        studentMap.put(2L, new Student(2L, "李四", 22));
        studentMap.put(3L, new Student(3L, "王五", 23));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
