package xyz.fusheng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @FileName: Student
 * @Author: code-fusheng
 * @Date: 2020/5/22 9:38
 * @version: 1.0
 * Description: Student 实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
