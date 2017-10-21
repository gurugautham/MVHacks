package com.example.test1.VolunteerConnect;

import java.util.ArrayList;

/**
 * Created by saikumarmajeti on 10/21/17.
 */

public class Event {
    public Address address;
    public ArrayList<UserProfile> people;
    public int peopleRequired;
    public int month, day, year;



    public Event(Address address, int peopleRequired, int month, int day, int year) {
        this.address = address;

        this.people = new ArrayList<UserProfile>();
        this.peopleRequired = peopleRequired;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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

    public void setTime(int month, int day, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /*public boolean isBefore(Event eventToCheck){
        if(eventToCheck.getYear() <= this.getYear())
            return true;
        else if(eventToCheck.getMonth() <= this.getMonth())
            return true;
        else if(eventToCheck.getDay() <= this.getDay())
            return true;
        else
            return false;
    }*/

}


// setdate takes in 3 parameters(month, date, year)
// setPeopleRequired
// addUser(takes in user object param)
// setAddress
//