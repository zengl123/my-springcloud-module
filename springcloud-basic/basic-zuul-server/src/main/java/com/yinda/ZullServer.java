package com.yinda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:网关服务
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/3/19 23:30
 * @UpdateUser:
 * @UpdateDate:2019/3/19 23:30
 * @UpdateRemark:
 * @Version:
 */
@SpringBootApplication
@EnableEurekaClient
public class ZullServer {
    public static void main(String[] args) {
        SpringApplication.run(ZullServer.class, args);
    }
}
