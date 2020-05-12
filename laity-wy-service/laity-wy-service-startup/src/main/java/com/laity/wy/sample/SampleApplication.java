package com.laity.wy.sample;

import lombok.extern.slf4j.Slf4j;
// import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sample服务启动类
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
@SpringBootApplication
//@MapperScan("com.laity.wy.sample.dao")
@Slf4j
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class);
        log.info("示例服务工程启动完成");
    }
}