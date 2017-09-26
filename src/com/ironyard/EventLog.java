package com.ironyard;

import java.util.ArrayList;
import java.util.List;
import java.lang.IllegalArgumentException;

public class EventLog {
    private static List<Event> eventList = new ArrayList<>();

    public static boolean addEvent(Event event) throws IllegalArgumentException {
        if (event.getAction().equals("Face2Face") || event.getAction().equals("PhoneCall") || event.getAction().equals("TextMessaging") || event.getAction().equals("Unknown")){
            System.out.println("Your event: " + event.getName() + " has been added to the List.");
            eventList.add(event);
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int getNumEvents() {
        return eventList.size();
    }

    public EventLog() {

    }
}
