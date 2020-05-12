package com.laity.wy.core.model;

import com.laity.wy.core.constants.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 服务响应对象
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
@Data
@ToString
@AllArgsConstructor
public class RemoteResponse<T> implements Serializable {
    private String code;

    private String message;

    private T data;

    /**
     * 判断请求是否成功
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    public Boolean isSuccess() {
        return this.getCode().equals(Constants.ResponseStatus.SUCCESS.getCode());
    }

    /**
     * 成功
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    public static <T> RemoteResponse<T> success(ResponseStatus status, T data) {
        return new RemoteResponse(status.getCode(), status.getMessage(), data);
    }

    /**
     * 成功
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    public static <T> RemoteResponse<T> success(T data) {
        return success(Constants.ResponseStatus.SUCCESS, data);
    }

    /**
     * 成功
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    public static <T> RemoteResponse<T> success() {
        return success(null);
    }

    /**
     * 失败
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    public static <T> RemoteResponse<T> failed(String message) {
        return new RemoteResponse(Constants.ResponseStatus.FAILED.getCode(), message, null);
    }

    /**
     * 失败
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    public static <T> RemoteResponse<T> failed(ResponseStatus status) {
        return new RemoteResponse(status.getCode(), status.getMessage(), null);
    }
}