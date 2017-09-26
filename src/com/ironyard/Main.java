package com.ironyard;

public class Main {

    public static void main(String[] args) {
        Event event1 = new Event("Call Cosmo","PhoneCall");
        // Event event2 = new Event("Call Newman", "No way");
        Event event3 = new Event("Meet Elaine", "Face2Face");

        EventLog.addEvent(event1);
        // EventLog.addEvent(event2); This throws the exception.
        EventLog.addEvent(event3);

        System.out.println("There are " + EventLog.getNumEvents() + " in the list.");
    }
}
