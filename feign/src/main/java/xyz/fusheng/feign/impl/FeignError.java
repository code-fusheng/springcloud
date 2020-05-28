package xyz.fusheng.feign.impl;

import org.springframework.stereotype.Component;
import xyz.fusheng.entity.Student;
import xyz.fusheng.feign.FeignProvideClient;

import java.util.Collection;

/**
 * @FileName: FeignError
 * @Author: code-fusheng
 * @Date: 2020/5/27 16:39
 * @version: 1.0
 * Description:
 */

@Component
public class FeignError implements FeignProvideClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String getPort() {
        return "服务器维护中";
    }
}
