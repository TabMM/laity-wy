package com.laity.wy.sample.service.impl;

import com.laity.wy.core.model.RemoteResponse;
import com.laity.wy.sample.service.WelcomeService;
import org.springframework.stereotype.Service;

/**
 * 欢迎服务接口实现
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
@Service("welcomeService")
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public RemoteResponse<String> getWords() {
        return RemoteResponse.success("Welcome to Dubbo.");
    }
}