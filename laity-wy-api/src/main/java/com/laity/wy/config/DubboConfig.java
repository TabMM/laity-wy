package com.laity.wy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * API消费者文件配置
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
@Configuration
@ImportResource("classpath:laity-wy-api-consumer.xml")
public class DubboConfig {
}