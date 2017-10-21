package com.example.test1.VolunteerConnect;

import java.util.ArrayList;

/**
 * Created by saikumarmajeti on 10/21/17.
 */

public class Event {
    public Address address;
    public ArrayList<UserProfile> people;
    public int peopleRequired;
    public int month, date, year;


    public Event(Address address, int peopleRequired, int month, int date, int year) {
        this.address = address;
        this.people = new ArrayList<UserProfile>();
        this.peopleRequired = peopleRequired;
        this.month = month;
        this.date = date;
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<UserProfile> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<UserProfile> people) {
        this.people = people;
    }

    public int getPeopleRequired() {
        return peopleRequired;
    }

    public void setPeopleRequired(int peopleRequired) {
        this.peopleRequired = peopleRequired;
    }

    public void setTime(int month, int date, int year){
        setDate(date);
        setMonth(month);
        setYear(year);
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// setdate takes in 3 parameters(month, date, year)
// setPeopleRequired
// addUser(takes in user object param)
// setAddress
//