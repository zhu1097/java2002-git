package com.qf.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAdvice {
    @Before("execution(public void com.qf.dao.impl.UserDaoImpl.add())")
    public void before(){
        System.out.println("前置通知");
    }
    public void afterAdvice(){
        System.out.println("后置通知");
    }
    public void after_throw(){
        System.out.println("后置通知，发生异常不触发");
    }
    public void return_throwing(){
        System.out.println("异常通知（在目标方法时，发生异常时触发）");
    }
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知（在目标方法之前）");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕通知（在目标方法之后）");
        return proceed;
    }


}
