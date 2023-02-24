package main;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        TimeItAspect timeItAspect = new TimeItAspect();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(myClass);
        proxyFactory.addAdvice(timeItAspect);

        MyClass proxy = (MyClass) proxyFactory.getProxy();
        proxy.myMethod();
    }
}

