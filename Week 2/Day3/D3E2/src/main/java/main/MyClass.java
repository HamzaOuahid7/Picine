package main;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class MyClass {
    @TimeIt
    public void myMethod() {
        System.out.println("hello form AOP");
    }
}