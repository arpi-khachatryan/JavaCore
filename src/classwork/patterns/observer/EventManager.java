package classwork.patterns.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventManager {

    private Map<String, Set<EventListener>> listeners;

    public EventManager() {
        listeners = new HashMap<>();
    }

//    public void subscribe(String eventType, EventListener listener) {
//        listeners.computeIfAbsent(eventType, k -> new HashSet<>()).add(listener);
//    }

    public void subscribe(String eventType, EventListener listener) {
        Set<EventListener> eventListeners = listeners.get(eventType);
        if (eventListeners == null) {
            eventListeners = new HashSet<>();
            listeners.put(eventType, eventListeners);
        }
        eventListeners.add(listener);
    }


    public void unsubscribe(String eventType, EventListener listener) {
        listeners.getOrDefault(eventType, new HashSet<>()).remove(listener);
    }

//    public void notify(String eventType, String data) {
//        listeners.getOrDefault(eventType, new HashSet<>())
//                .forEach(listener -> listener.update(data));
//    }

    public void notify(String eventType, String data) {
        Set<EventListener> eventListeners = listeners.get(eventType);
        if (eventListeners != null) {
            for (EventListener listener : eventListeners) {
                listener.update(data);
            }
        }
    }
}
