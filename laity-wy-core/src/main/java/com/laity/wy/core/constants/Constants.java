package com.laity.wy.core.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 系统常量
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
public interface Constants {

    /**
     * 通用的响应状态定义
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    @Getter
    @AllArgsConstructor
    enum ResponseStatus implements com.laity.wy.core.model.ResponseStatus {
        SUCCESS("SUCCESS", "请求成功"),
        FAILED("FAILED", "请求失败");
        private String code;

        private String message;
    }

}