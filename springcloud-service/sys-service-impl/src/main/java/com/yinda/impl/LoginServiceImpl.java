package com.yinda.impl;

import com.yinda.ILoginService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/3/25 10:55
 * @UpdateUser:
 * @UpdateDate:2019/3/25 10:55
 * @UpdateRemark:
 * @Version:
 */
@Service
public class LoginServiceImpl implements ILoginService {
    /**
     * 访问登录页
     *
     * @return
     */
    @Override
    public String index() {
        System.out.println("true = " + true);
        return "index";
    }

    /**
     * 登录
     *
     * @param session
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    public ModelAndView loginPost(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    /**
     * 访问系统首页
     *
     * @param request
     * @param session
     * @param model
     * @return
     */
    @Override
    public String index(HttpServletRequest request, HttpSession session, Model model) {
        return null;
    }
}
