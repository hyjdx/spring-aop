package com.benny.study.config;

import com.benny.study.aop.PlayAdvice;
import com.benny.study.aop.PlayPointcut;
import org.aopalliance.aop.Advice;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by bennyhou on 2016/5/16.
 */
@Configuration
public class TestDefaultPointcutAdvisor extends DefaultPointcutAdvisor{

    @PostConstruct
    public void init(){
        System.out.println("init");
        Pointcut pointcut = new PlayPointcut();
        setPointcut(pointcut);
        PlayAdvice playAdvice = new PlayAdvice();
        setAdvice(playAdvice);
    }

}
