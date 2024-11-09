package observerPattern.emailSubscriberExample.model;

import observerPattern.emailSubscriberExample.interfaces.Observer;
import observerPattern.emailSubscriberExample.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void update() {
        String message = this.topic.getUpdate();
        System.out.println("Received message on " + name + ": " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
