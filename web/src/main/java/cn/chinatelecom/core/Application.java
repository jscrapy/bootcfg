package cn.chinatelecom.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by cxu on 2017/2/28.
 */
@SpringBootApplication
public class Application {

    public static void main(String[]args) throws IOException, InterruptedException {
        SpringApplication.run(Application.class, args);//启动
    }

}
