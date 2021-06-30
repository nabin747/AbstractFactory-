package com.nabin;

import com.nabin.FactoryPattern.Gui.GUIFactory;
import com.nabin.FactoryPattern.Gui.OSXFactory;
import com.nabin.FactoryPattern.Gui.WinFactory;

public class Factory {
    public static GUIFactory getFactory(String factoryType){
        switch (factoryType){
            case "Win":
                return new WinFactory();
            case "OSX":
                return new OSXFactory();
        }
        return null;
    }
}
