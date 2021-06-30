package com.nabin;

import com.nabin.FactoryPattern.Button;
import com.nabin.FactoryPattern.Gui.GUIFactory;

public class FactoryMain {
    public static void main(String[] args) {
        GUIFactory winfacrory = Factory.getFactory("Win");
        Button whichbutton = winfacrory.CreateButton("Win");
        whichbutton.paint();
    }
}
