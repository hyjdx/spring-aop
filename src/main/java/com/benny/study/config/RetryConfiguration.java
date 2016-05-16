package com.benny.study.config;

import org.aopalliance.aop.Advice;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.IntroductionAdvisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Created by bennyhou on 2016/5/16.
 */
 public class RetryConfiguration extends AbstractPointcutAdvisor implements IntroductionAdvisor, BeanFactoryAware {

    @Override
    public Advice getAdvice() {
        return null;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public ClassFilter getClassFilter() {
        return null;
    }

    @Override
    public void validateInterfaces() throws IllegalArgumentException {

    }

    @Override
    public Class<?>[] getInterfaces() {
        return new Class<?>[0];
    }

    @Override
    public Pointcut getPointcut() {
        return null;
    }
}
