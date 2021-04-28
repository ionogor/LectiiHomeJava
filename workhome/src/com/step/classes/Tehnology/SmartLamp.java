package com.step.classes.Tehnology;

public class SmartLamp {
    public String color;
    Double price;
    int light=0;

    public void Buy()
    {
        System.out.println("This lamp is sold");
    }
    public void SetLight(int light)
    {
        this.light=light;

        System.out.println("Light is high "+light);
    }

}
