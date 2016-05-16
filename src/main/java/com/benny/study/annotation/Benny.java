package com.benny.study.annotation;

import java.lang.annotation.*;

/**
 * Created by bennyhou on 2016/5/16.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Benny {
    String value() default "benny";
}
