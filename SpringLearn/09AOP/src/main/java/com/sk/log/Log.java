package com.sk.log;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice{

    //这个方法会在执行方法之前自动调用
    //method 要执行的目标对象的方法
    //args 参数
    //target 目标对象
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("前置通知");
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
