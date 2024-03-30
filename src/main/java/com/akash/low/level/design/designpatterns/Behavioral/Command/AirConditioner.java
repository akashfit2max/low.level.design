package com.akash.low.level.design.designpatterns.Behavioral.Command;

public class AirConditioner {
    boolean isOn;
    int temp;

    public void turnOnAc() {
        isOn = true;
        System.out.println("AC is on..");
    }

    public void turnOfAc() {
        isOn = false;
        System.out.println("AC is off....");
    }

    public void setTemp(int temp) {
        this.temp = temp;
        System.out.println("temp changed to...." + temp);
    }
}
