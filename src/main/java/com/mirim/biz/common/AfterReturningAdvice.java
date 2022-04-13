package com.mirim.biz.common;

import com.mirim.biz.user.UserVO;
import org.aspectj.lang.JoinPoint;

public class AfterReturningAdvice {
    public void AfterReturningAdvice(JoinPoint jp, Object returningObj){
        String method = jp.getSignature().getName();

        if(returningObj instanceof UserVO){ // 객체 타입 판별
            UserVO user = (UserVO) returningObj;    // 다운캐스팅

            if(user.getRole().equals("Admin")){
                System.out.println(user.getName() + " 로그인(Admin)");
            }
        }

        System.out.println("[사후처리] " + method + "() 메서드 리턴 값:" + returningObj.toString());
    }
}
