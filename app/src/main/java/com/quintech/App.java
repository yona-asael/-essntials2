package com.quintech;

import com.quintech.entties.Light;

public class App {

    public static void main(String[] args) {
        Light light = new Light(10000);
        light.turnOn();
        System.out.println(
            String.format(
                "The light with intesity %s is Turn on? %s", 
                light.getIntenesntiy().toPlainString(),
                light.itIsOn()
            )
        );
    }
}
