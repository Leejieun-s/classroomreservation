package com.lanclass;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lanclass.mapper")
@SpringBootApplication
public class Application implements CommandLineRunner {
    private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);
    @Value("${server.port}")
    private int serverPort;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args)  {
        LOGGER.info("--------------------启动成功------------------------");
        LOGGER.info("--------------------访问端口{}---------------------", serverPort);
    }
}
