package com.example.test1.myapplication;

/**
 * Created by saikumarmajeti on 10/21/17.
 */

public class Address {
    String zipCode;
    String city;
    String state;
    String streetAddress;

    public Address(String a, String b, String c, String d){
        zipCode = a;
        city = b;
        state = c;
        streetAddress = d;
    }

    public void result(String duration){
        String answer = "";
        answer = "It takes "+Double.parseDouble(duration)/3600+" hours";
    }

}
