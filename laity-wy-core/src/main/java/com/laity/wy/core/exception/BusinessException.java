package com.laity.wy.core.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 业务异常
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
@Data
@AllArgsConstructor
public class BusinessException extends Exception {

    private String code;

    private String message;
}