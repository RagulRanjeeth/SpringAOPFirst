package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//
//    @Aspect
//    @Component
//    public class LoggingAspect {
//
//        public LoggingAspect()
//        {
//            System.out.println("This is the Aspect");
//        }
//
//        @Before("execution(* org.example.Shopping.ShopCheck(..))")
//        public void logger()
//        {
//            System.out.println("This is the before log");
//
//        }
//    }


@Aspect
@Component
public class LoggingAspect {


    @Before("execution(* org.example.Shopping.ShopCheck(..))")
    public void beforelogger(JoinPoint jp) {
        System.out.println(jp.getSignature());
        String str = jp.getArgs()[0].toString();
        System.out.println("This is the before log" + str);
    }

    @After("execution(* org.example.Shopping.ShopCheck(..))")
    public void afterlog()
    {
        System.out.println("This is the after log");
    }

    @Pointcut("execution(* org.example.Shopping.check(..))")
    public void afterReturninPointcut()
    {

    }

    @AfterReturning(pointcut = "afterReturninPointcut()", returning = "value")
    public void afterReturnin(String value)
    {
        System.out.println("After returning " + value);
    }


}
