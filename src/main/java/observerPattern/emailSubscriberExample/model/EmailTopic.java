package observerPattern.emailSubscriberExample.model;

import observerPattern.emailSubscriberExample.interfaces.Observer;
import observerPattern.emailSubscriberExample.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {
    private String message;
    private final List<Observer> observers;

    public EmailTopic() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null object/observer");

        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers)
            observer.update();
    }

    @Override
    public String getUpdate() {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to my topic: " + message);
        this.message = message;
        notifyObservers();
    }
}
