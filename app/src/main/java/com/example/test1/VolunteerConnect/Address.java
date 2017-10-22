package com.example.test1.VolunteerConnect;

/**
 * Created by saikumarmajeti on 10/21/17.
 */

public class Address {
    String zipCode;
    String city;
    String state;
    String streetAddress;
    double latitude;
    double longtitude;

    public Address(String a, String b, String c, String d, double la, double lo){
        zipCode = a;
        city = b;
        state = c;
        streetAddress = d;
        latitude = la;
        longtitude = lo;
    }

    public void result(String duration){
        String answer = "";
        answer = "It takes "+Double.parseDouble(duration)/3600+" hours";
    }

}
