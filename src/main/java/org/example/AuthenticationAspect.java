package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("execution(* org.example.Shopping.ShopCheck(..))")
    public void AuthenticationPoint()
    {

    }


    @Pointcut("execution(* *.*.ShopCheck(..))")
    public void AuthorizationPoint()
    {

    }

    @Before("AuthenticationPoint()")
    public void authentic()
    {
        System.out.println("This is the authenticat poin");
    }
}