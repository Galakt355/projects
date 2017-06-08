package innerclasses.controller;

import java.util.*;

public class Controller {
    private List<Event> eventList = new LinkedList<Event>();

    public void addEvent(Event c){
        eventList.add(c);
    }

    public void run(){

        /**
         * The first variant of obtaining an iterator
         */
        Iterator<Event> iterator = eventList.iterator();
        /**
         * The second variant of obtaining an iterator
         */
        ListIterator<Event> listIterator = eventList.listIterator();

        while(iterator.hasNext()){
            for(Event e : new LinkedList<Event>(eventList)){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}