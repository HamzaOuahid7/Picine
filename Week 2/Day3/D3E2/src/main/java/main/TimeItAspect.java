package main;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import org.aspectj.lang.annotation.Aspect;


@Aspect
public class TimeItAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        long startTime = System.nanoTime();
        Object result = invocation.proceed();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // convert nanoseconds to milliseconds
        System.out.println("Method " + invocation.getMethod().getName() + " took " + duration + "ms to execute.");
        return result;
    }
}