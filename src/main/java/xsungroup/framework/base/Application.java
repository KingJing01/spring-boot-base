package xsungroup.framework.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "xsungroup.framework.base.configure",
        "xsungroup.framework.base.controller",
        "xsungroup.framework.base.exception",
        "xsungroup.framework.base.service"})
@MapperScan("xsungroup.framework.base.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
