package com.company;

import java.util.Calendar;

public class Message {

    public String num;
    public String txt;

    public Message(String phone, String text)
    {
        num = phone;
        txt = text;
        System.out.println("New Text Message!");
        System.out.println("From: " + num);
        System.out.println(txt);
    }

    public void stats()
    {
        String number = num;
        String tmessage = txt;
    }

    public String getStat()
    {
        return stats;
    }

    public Calendar timeRecieved()
    {
        Calendar calobj = Calendar.getInstance();
        return calobj;
    }
}
