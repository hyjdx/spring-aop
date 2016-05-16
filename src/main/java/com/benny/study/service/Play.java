package com.benny.study.service;

import org.springframework.stereotype.Service;

/**
 * Created by bennyhou on 2016/5/16.
 */
@Service
public class Play {
    public void playService(String what){
        System.out.println("play "+what);
    }
}
