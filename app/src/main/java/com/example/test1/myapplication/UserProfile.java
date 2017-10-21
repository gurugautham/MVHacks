package com.example.test1.myapplication;

/**
 * Created by saikumarmajeti on 10/21/17.
 */

public class UserProfile {
    public Address address;
    public String name;
    public String phoneNumber;
    public int age;

    public UserProfile(Address address, String name, String phoneNumber, int age) {
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    
}
