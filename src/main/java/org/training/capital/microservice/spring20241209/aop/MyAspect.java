package org.training.capital.microservice.spring20241209.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* org.training.capital.microservice.spring20241209.aop.MyCalleeBean.*(String)) && args(xyz)")
    public void pc(String xyz) {
    }


    @Before("pc(xyz)")
    public void before(JoinPoint joinPointParam,
                       String xyz) {
        System.out.println("--------------------------------  Before MyCallee ------ : "
                           + xyz
                           + " joined : "
                           + joinPointParam);
    }

    @After("pc(xyz)")
    public void after(JoinPoint joinPointParam,
                      String xyz) {
        System.out.println("--------------------------------  After MyCallee ------ : "
                           + xyz
                           + " joined : "
                           + joinPointParam);
    }

    @AfterReturning(value = "pc(xyz)", returning = "abc")
    public void after(JoinPoint joinPointParam,
                      String xyz,
                      String abc) {
        System.out.println("--------------------------------  AfterReturning MyCallee ------ : "
                           + xyz
                           + " joined : "
                           + joinPointParam
                           + " returned : "
                           + abc);
    }

    @Around("pc(xyz)")
    public Object around(ProceedingJoinPoint proceedingJoinPointParam,
                         String xyz) {
        try {
            Object[] argsLoc = proceedingJoinPointParam.getArgs();
            Object[] newArgs = new Object[1];
            newArgs[0] = "mehmet";
            long   c          = System.nanoTime();
            String proceedLoc = (String) proceedingJoinPointParam.proceed(newArgs);
            System.out.println("****------ Delta : " + (System.nanoTime() - c));
            return "Ben bunu değiştirdim : " + proceedLoc;
        } catch (Throwable exp) {
        }
        return null;
    }


    @Around("@annotation(myTraceParam)")
    public Object around(ProceedingJoinPoint proceedingJoinPointParam,
                         MyTrace myTraceParam) {
        try {
            long   c          = System.nanoTime();
            Object proceedLoc = proceedingJoinPointParam.proceed();
            System.out.println("****------ Delta for " + myTraceParam.value() + " : " + (System.nanoTime() - c));
            return proceedLoc;
        } catch (Throwable exp) {
        }
        return null;
    }

}
