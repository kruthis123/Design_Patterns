package observerPattern.emailSubscriberExample.interfaces;

public interface Observer {
    public void update();
    public void setSubject(Subject subject);
}
