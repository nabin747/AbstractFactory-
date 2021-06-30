package com.nabin.FactoryPattern.Gui;

import com.nabin.FactoryPattern.Button;
import com.nabin.FactoryPattern.WinButton;

public class WinFactory implements GUIFactory{
    @Override
    public Button CreateButton(String buttonType) {
        switch (buttonType){
            case "Win":
                return new WinButton();
            default:
                return null;
        }
    }
}
