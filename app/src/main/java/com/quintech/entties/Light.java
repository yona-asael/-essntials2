package com.quintech.entties;

import java.math.BigDecimal;

public class Light {
    private boolean isOn;
    private BigDecimal intenesntiy;

    public Light(int value) {
        this.isOn = false;
        this.setIntenesntiy(new BigDecimal(value));
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean itIsOn() {
        return this.isOn;
    }

    public BigDecimal getIntenesntiy() {
        return intenesntiy;
    }

    public void setIntenesntiy(BigDecimal intenesntiy) {
        this.intenesntiy = intenesntiy;
    }

    public void checkStatusLight(){
        System.out.println(String.format("The light intensity is %s is turn on? %s", this.intenesntiy.toPlainString(), this.isOn));
    }

}
