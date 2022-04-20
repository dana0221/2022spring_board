package com.mirim.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
    public void exceptionLog(JoinPoint jp, Exception exceptObj){
        String method = jp.getSignature().getName();
        System.out.println("[에외처리]" + method + "() 메서드 수행 중 발생된 예외 메시지 : " + exceptObj.getMessage());
    }
}
