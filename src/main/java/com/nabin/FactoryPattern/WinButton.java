package com.nabin.FactoryPattern;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("I'm from WinButton");
    }
}
