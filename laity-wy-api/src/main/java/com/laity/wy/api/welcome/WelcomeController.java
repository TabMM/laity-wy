package com.laity.wy.api.welcome;

import com.laity.wy.api.ApiResponse;
import com.laity.wy.api.BaseController;
import com.laity.wy.core.model.RemoteResponse;
import com.laity.wy.sample.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 欢迎接口
 * @author 懒猴子CG
 * @date 2020/05/12 10:54
 */
@RestController
public class WelcomeController extends BaseController {

    @Autowired
    private WelcomeService welcomeService;

    /**
     * 欢迎
     * @author Caesar Liu
     * @date 2019-08-01 16:56
     */
    @GetMapping("/welcome")
    public ApiResponse<String> welcome() {
        RemoteResponse<String> queryResponse = welcomeService.getWords();
        if (!queryResponse.isSuccess()) {
            return ApiResponse.failed(queryResponse);
        }
        return ApiResponse.success(queryResponse.getData());
    }
}