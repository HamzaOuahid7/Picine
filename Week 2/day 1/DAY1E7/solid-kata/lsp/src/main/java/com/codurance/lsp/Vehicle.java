package com.codurance.lsp;

public abstract class Vehicle {


    protected boolean engineStarted = false;

    public abstract void startEngine() ;

    public abstract boolean engineIsStarted();

    public abstract void stopEngine();

    public abstract void fillUpWithFuel();

    public abstract void chargeBattery();


}
