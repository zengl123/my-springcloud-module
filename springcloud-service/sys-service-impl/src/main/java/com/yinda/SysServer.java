package com.yinda;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/3/25 10:45
 * @UpdateUser:
 * @UpdateDate:2019/3/25 10:45
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
@SpringBootApplication
public class SysServer {
    public static void main(String[] args) {
        log.debug("sys 服务正常启动");
        SpringApplication.run(SysServer.class, args);
    }
}
