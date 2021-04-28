package com.step.classes.Tehnology;

import java.util.stream.StreamSupport;

public class MobilePhone {
    public String message;
    public String contact;

    public void Call()
    {

        System.out.println("Call person "+contact);
    }
    public void  SendMessage()
    {
        System.out.println("Send message from "+contact+" "+message);
    }
}
