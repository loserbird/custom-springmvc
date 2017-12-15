package com.loserbird.mvc.annotation;

import java.lang.annotation.*;

/**
 * @Author: bingqin
 * @Date: 2017/12/15
 * @Description:
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {
    String value() default  "";
}
