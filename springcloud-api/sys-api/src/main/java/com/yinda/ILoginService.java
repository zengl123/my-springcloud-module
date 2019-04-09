package com.yinda;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
 * @CreateDate:2019/3/25 9:56
 * @UpdateUser:
 * @UpdateDate:2019/3/25 9:56
 * @UpdateRemark:
 * @Version:
 */
@Controller
public interface ILoginService {
    /**
     * 访问登录页
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index();

    /**
     * 登录
     *
     * @param session
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    ModelAndView loginPost(HttpSession session, HttpServletRequest request, HttpServletResponse response);

    /**
     * 访问系统首页
     *
     * @param request
     * @param session
     * @param model
     * @return
     */
    @RequestMapping(value = "/index")
    String index(HttpServletRequest request, HttpSession session, Model model);
}