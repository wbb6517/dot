package org.example.dotstart.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EasyDemoAspect {


    // 匹配方法
//    @Pointcut("execution(* org.example.dotstart.aop.*.*.get*(..))")
//    public void getMethods() {}
//
//    @Before("getMethods()")
//    public void logBeforeServiceLayer() {
//        System.out.println("执行get方法");
//    }
//
//    @Pointcut("execution(* org.example.dotstart.aop.*.*.save*(..)) && args(entity)")
//    public void saveMethods(Object entity) {}
//
//    @Before(value = "saveMethods(entity)", argNames = "entity")
//    public void logBeforeSaveMethods(Object entity) {
//        System.out.println("执行save方法: " + entity);
//    }
//
//    // 匹配类
//    @Pointcut("within(org.example.dotstart.aop.controller.AOPController)")
//    public void userServiceMethods() {}
//
//    @Before("userServiceMethods()")
//    public void userServiceMethodsLayer() {
//        System.out.println("匹配类");
//    }




    // 定义一个命名切入点，匹配com.example.service包下所有类的所有方法
    @Pointcut("execution(* org.example.dotstart.aop.*.*.get*(..))")
    public void serviceMethods() {}

    // 前置通知
    @Before("serviceMethods()")
    public void logBefore() {
        System.out.println("前置通知");
    }

    // 后置通知
    @After("serviceMethods()")
    public void logAfter() {
        System.out.println("后置通知");
    }

    // 返回通知
    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void logAfterReturning(Object result) {
        System.out.println("返回通知: " + result);
    }

    // 异常通知
    @AfterThrowing(pointcut = "serviceMethods()", throwing = "error")
    public void logAfterThrowing(Throwable error) {
        System.out.println("异常通知: " + error);
    }

    // 环绕通知
    @Around("serviceMethods()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知 - 前");
        Object result = joinPoint.proceed();
        System.out.println("环绕通知 - 后");
        return result;
    }

}
