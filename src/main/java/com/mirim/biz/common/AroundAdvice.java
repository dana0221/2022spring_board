package com.mirim.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {
    @Around("PointcutCommon.allPointcut()")
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable{
        String method = pjp.getSignature().getName();

        // Before
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object obj = pjp.proceed();     // Spring 컨테이너를 통해 사용자의 요청 처리

        // After
        stopWatch.stop();
        System.out.println(method + "()메서드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");

        // 사용자에게 return
        return obj;
    }
}
