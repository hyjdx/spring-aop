package com.benny.study.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class PlayAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        System.out.println("Play.playService before advice");
    }
}