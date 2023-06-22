package com.lulu.sqlfilter;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@MapperScan("com.lulu.sqlfilter.mapper")
public class SqlFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlFilterApplication.class, args);
        log.info("启动成功");
    }

}
