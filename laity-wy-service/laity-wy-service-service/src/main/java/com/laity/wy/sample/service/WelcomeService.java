package com.laity.wy.sample.service;

import com.laity.wy.core.model.RemoteResponse;

/**
 * 欢迎服务接口
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
public interface WelcomeService {

    /**
     * 获取欢迎语
     * @author 懒猴子CG
     * @date 2020/05/12 10:54
     */
    RemoteResponse<String> getWords();
}