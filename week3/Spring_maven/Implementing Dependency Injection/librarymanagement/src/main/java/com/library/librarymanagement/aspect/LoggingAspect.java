package com.library.librarymanagement.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class LoggingAspect {

    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();  // Execute the actual method

        long end = System.currentTimeMillis();
        System.out.println("[AOP LOG] " + joinPoint.getSignature() + " executed in " + (end - start) + "ms");

        return result;
    }
}
