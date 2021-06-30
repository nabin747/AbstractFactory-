package com.nabin.FactoryPattern;

public class OSXButton implements Button{
    @Override
    public void paint() {
        System.out.println("I'm from OSXButton");
    }
}
