package com.benny.study;

import com.benny.study.service.Play;
import com.benny.study.service.Some;
import com.benny.study.service.impl.SomeImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by bennyhou on 2016/5/16.
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@Transactional
@SpringApplicationConfiguration(Application.class)
public class SomeImplTest {
    @Autowired
    private Some some;

    @Test
    public void testDoSome() {
        some.doSome();
        some.doSome1();
        ((SomeImpl)some).doSome2();
        boolean flag = AopUtils.isCglibProxy(some);
        System.out.println("is cglibProxy ?: "+flag);
    }

    @Autowired
    private Play play;
    @Test
    public void testPlay() {
       play.playService("hello");
        boolean flag = AopUtils.isCglibProxy(some);
        System.out.println("is cglibProxy ?: "+flag);

        boolean flag1 = AopUtils.isJdkDynamicProxy(some);
        System.out.println("is isJdkDynamicProxy ?: "+flag1);

        boolean flag2 = AopUtils.isAopProxy(some);
        System.out.println("is isAopProxy ?: "+flag2);


    }
}
