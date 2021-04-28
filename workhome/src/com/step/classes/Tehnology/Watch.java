package com.step.classes.Tehnology;

import java.util.Date;
import java.util.Timer;

public class Watch {
    public Date datetime;
    public Timer timer;

    public void SetAllarm(Date datetime)
    {
        this.datetime=datetime;
        System.out.println("Alarm start in "+datetime);
    }
    public void SetTimer(Timer timer)
    {
        this.timer=timer;
        System.out.println("Timer start: "+timer);
    }

}
