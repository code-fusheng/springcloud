package xyz.fusheng.repository;

import xyz.fusheng.entity.Student;

import java.util.Collection;

/**
 * @FileName: StudentRepository
 * @Author: code-fusheng
 * @Date: 2020/5/22 9:42
 * @version: 1.0
 * Description: Student 业务逻辑接口
 */

public interface StudentRepository {
    /**
     * 查询所有
     * @return
     */
    public Collection<Student> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Student findById(long id);
    /**
     * 保存更新
     * @param student
     */
    public void saveOrUpdate(Student student);
    /**
     * 根据id删除
     * @param id
     */
    public  void deleteById(long id);
}
