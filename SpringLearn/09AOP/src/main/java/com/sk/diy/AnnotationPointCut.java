package com.sk.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三 注解实现AOP
@Aspect//标注这个类是个切面
public class AnnotationPointCut {

    //前置通知
    @Before("execution(* com.sk.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }

    //后置通知
    @After("execution(* com.sk.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行hou");
    }

    //
    @Around("execution(* com.sk.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Object proceed = joinPoint.proceed();
        System.out.println("proceed-----"+proceed);
        System.out.println("joinPoint.getSignature()-----"+joinPoint.getSignature());
        System.out.println("环绕后");

    }
}
