package com.binw.dameng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages="com.binw.dameng.mapper")
@EnableSwagger2
public class DamengApplication {
    public static void main(String[] args) {
        SpringApplication.run(DamengApplication.class,args);
        System.out.println("项目完成启动");
    }
}
