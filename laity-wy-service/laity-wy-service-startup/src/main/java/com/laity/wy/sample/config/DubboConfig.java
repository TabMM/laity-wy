package com.laity.wy.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Dubbo配置导入
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
@Configuration
@ImportResource("classpath:laity-wy-service-provider.xml")
public class DubboConfig {
}