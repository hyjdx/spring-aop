package com.benny.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author benny
 * @since 2016-05-16
 */
@Controller
@EnableTransactionManagement
@EnableWebMvc
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        CreateH2Database createH2Database = new CreateH2Database();
        createH2Database.create();
    }

    @RequestMapping("/")
    String home() {
        return "redirect:countries";
    }
}
