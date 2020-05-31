package com.wanggang.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.wanggang.aop.MathCaculator.*(..))")
    public void poinCut() {

    }

    @Before("poinCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名:"+joinPoint.getSignature().getName()+"开始运行...参数列表:"+Arrays.asList(args));
    }

    @After("poinCut()")
    public void logEnd() {
        System.out.println("除法结束...参数列表是{}...");
    }

    @AfterReturning(value = "poinCut()",returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法正常返回...计算结果:"+result);
    }

    @AfterThrowing(value = "poinCut()",throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法异常...异常信息:"+exception);
    }
}
