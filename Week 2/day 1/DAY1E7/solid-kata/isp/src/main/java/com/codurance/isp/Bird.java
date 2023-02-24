package com.codurance.isp;

public class Bird implements Flying,Runing {
    @Override
    public void run() {
        System.out.print("Bird is running");
    }
    @Override
    public void fly() {
        System.out.print("Bird is flying");
    }
}