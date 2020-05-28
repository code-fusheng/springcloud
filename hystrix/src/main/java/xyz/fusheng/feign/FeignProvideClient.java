package xyz.fusheng.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.fusheng.entity.Student;

import java.util.Collection;

/**
 * @FileName: FeignProvideClient
 * @Author: code-fusheng
 * @Date: 2020/5/27 16:16
 * @version: 1.0
 * Description:
 * 1、 fallback = FeignError.class 降级处理
 */

@FeignClient(value = "provider")
public interface FeignProvideClient {

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    /**
     * 获取端口
     * @return
     */
    @GetMapping("/student/getPort")
    public String getPort();

}
