package com.yinda.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:默认跳转页面
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/4/10 8:46
 * @UpdateUser:
 * @UpdateDate:2019/4/10 8:46
 * @UpdateRemark:
 * @Version:
 */
@Configuration
public class DefaultView extends WebMvcConfigurationSupport {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}