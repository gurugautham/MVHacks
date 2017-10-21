package com.example.test1.VolunteerConnect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by saikumarmajeti on 10/21/17.
 */

public class Database {
    public ArrayList<Event> events;

    public void sortByDate(int day, int month, int year){
        Collections.sort(events, new Comparator<Event>() {
            @Override
            public int compare(Event event, Event t1) {
                if(event.getYear() <= t1.getYear())
                    return -1;
                else if(event.getMonth() <= t1.getMonth())
                    return -1;
                else if(event.getDay() <= t1.getDay())
                    return -1;
                else if(t1.getYear() <= event.getYear())
                    return 1;
                else if(t1.getMonth() <= event.getMonth())
                    return 1;
                else if(t1.getDay() <= event.getDay())
                    return 1;
                else
                    return 0;

            }
        });


    }

    //sortByDate returns an arraylist of events sorted by date
    //sortByAddress take in user object(param) returns arraylist of events closest to user

}
