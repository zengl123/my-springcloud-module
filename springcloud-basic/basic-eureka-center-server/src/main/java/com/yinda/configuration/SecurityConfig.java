package com.yinda.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description: 新版本的security默认开启了csrf拦截, 所以需要禁用csrf功能
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/3/19 23:15
 * @UpdateUser:
 * @UpdateDate:2019/3/19 23:15
 * @UpdateRemark:
 * @Version:
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }
}
