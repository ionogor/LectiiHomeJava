package com.step.classes.Tehnology;

public class Television {
    public boolean status;
    public int soundvolume;

    public void On(boolean status)
    {
        this.status=status;

        if(status)
        {
            System.out.println("Tv on");
        }
        else
        {
            System.out.println("Tv is off");
        }

    }
    public void TvVolume(int soundvolume)
    {
        this.soundvolume=soundvolume;
        switch (soundvolume) {

            case 1:System.out.println("Volume is up"); break;
            case 2:System.out.println("Volume is down"); break;
            default:System.out.println("Enter up or down");
        }
    }

}
