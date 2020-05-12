package com.laity.wy.core.model;

/**
 * 响应状态
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
public interface ResponseStatus {

    /**
     * 获取响应码
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    String getCode();

    /**
     * 获取响应消息
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    String getMessage();
}