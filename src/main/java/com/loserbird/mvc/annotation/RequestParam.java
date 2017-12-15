package com.loserbird.mvc.annotation;

import java.lang.annotation.*;

/**
 * @Author: bingqin
 * @Date: 2017/12/15
 * @Description:
 **/
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default "";

    boolean required() default true;
}
