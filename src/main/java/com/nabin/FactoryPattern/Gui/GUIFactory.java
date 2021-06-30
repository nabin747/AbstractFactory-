package com.nabin.FactoryPattern.Gui;

import com.nabin.FactoryPattern.Button;

public interface GUIFactory {
    Button CreateButton(String buttonType);
}
