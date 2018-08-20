package com.taotao.manager.controller;

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhouyang
 * Date 2018/8/19.
 */
@Controller
public class TestController {

    @Autowired
    private TestService testServiceImpl;

    /**
     * 查询当前时间
     *
     * @return
     */
    @RequestMapping("/test/queryNow")
    @ResponseBody
    public String queryNow() {
        return this.testServiceImpl.queryNow();
    }
}
