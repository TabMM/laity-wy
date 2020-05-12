package com.laity.wy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * API应用启动类
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
@SpringBootApplication
@Slf4j
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class);
        log.info("API工程启动完成");
    }
}