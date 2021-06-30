package com.nabin.FactoryPattern.Gui;

import com.nabin.FactoryPattern.Button;
import com.nabin.FactoryPattern.OSXButton;

public class OSXFactory implements GUIFactory{
    @Override
    public Button CreateButton(String buttonType) {
        if (buttonType == "OSX"){
            return new OSXButton();
        }
        return null;
    }
}
