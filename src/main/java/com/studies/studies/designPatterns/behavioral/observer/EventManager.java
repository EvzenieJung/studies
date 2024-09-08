package com.studies.studies.designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Maintain the list of interested parties and notify them whenever the event is available
public class EventManager {
    Map<String, ArrayList<EventListener>> listeners = new HashMap<>();

    public EventManager (String ... operations) {
        for (String operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener listener) {
        ArrayList<EventListener> eventListeners = listeners.get(event);
        if (!eventListeners.contains(listener)) {
            eventListeners.add(listener);
        }
    }

    public void unsubscribe(String event, EventListener listener) {
        ArrayList<EventListener> eventListeners = listeners.get(event);
        eventListeners.remove(listener);
    }

    public void notify(String event, String file) {
        ArrayList<EventListener> eventListeners = listeners.get(event);
        if (eventListeners != null) {
            for (EventListener listener : eventListeners) {
                listener.notify(event, file);
            }
        }
    }
}
