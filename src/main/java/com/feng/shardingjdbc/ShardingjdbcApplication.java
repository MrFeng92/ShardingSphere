package com.feng.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.feng.shardingjdbc.mapper") //如果不加，启动时找不到mapper
public class ShardingjdbcApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ShardingjdbcApplication.class, args);
    }

}
