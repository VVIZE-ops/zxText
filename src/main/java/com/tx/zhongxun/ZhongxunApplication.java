package com.tx.zhongxun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages="controller")
@SpringBootApplication//(scanBasePackages = {"com.tx"})
public class ZhongxunApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhongxunApplication.class, args);
    }

}
