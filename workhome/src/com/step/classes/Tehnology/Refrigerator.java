package com.step.classes.Tehnology;

import java.sql.Time;
import java.util.Timer;

public class Refrigerator {
    public int temperature;
    public String allarm="Door Is Open!";

    public void SetTemperature(int temperature)
    {
        this.temperature=temperature;
        System.out.println("THE Refrigerator has temperature "+temperature);
    }
    public void  SendSoundIfDoorIsOpen()
    {
        System.out.println(allarm);

    }


}
