package com.yinda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright (C), 2018-${YEAR}, 湖南金峰信息科技有限公司
 *
 * @Description: Eureka服务启动类
 * @Author: ZENGLING
 * @钉钉: 17363645521
 * @CreateDate: 2019/3/18 15:23
 * @UpdateUser:
 * @UpdateDate: 2019/3/18 15:23
 * @UpdateRemark:
 * @Version:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaCenterServer {
    public static void main(String[] args) {

        SpringApplication.run(EurekaCenterServer.class, args);
    }
}
