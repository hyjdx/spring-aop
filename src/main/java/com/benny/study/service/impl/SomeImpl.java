package com.benny.study.service.impl;

import com.benny.study.annotation.Benny;
import com.benny.study.service.Some;
import org.springframework.stereotype.Service;

/**
 * Created by bennyhou on 2016/5/16.
 */
@Service
public class SomeImpl implements Some {

    @Override
    @Benny(value = "doSome")
    public void doSome() {
        System.out.println("doSome");

        //throw new IllegalStateException("test doSome Exception");



    }
//    @Benny(value = "doSome1")
    public void doSome1() {
        System.out.println("doSome1");
    }
    @Benny(value = "2")
    public void doSome2() {
        System.out.println("doSome2 cglib test");
    }
}
