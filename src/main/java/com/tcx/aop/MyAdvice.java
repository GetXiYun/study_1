package com.tcx.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.tcx.dao.BookDao.update())")
    private void up(){}

    @Before("up()")
    public void method(){
        System.out.println("共性方法");
    }
}
