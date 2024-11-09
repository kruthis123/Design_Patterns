package observerPattern.emailSubscriberExample;

import observerPattern.emailSubscriberExample.model.EmailTopic;
import observerPattern.emailSubscriberExample.model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        EmailTopicSubscriber firstObserver = new EmailTopicSubscriber("firstObserver");
        EmailTopicSubscriber secondObserver = new EmailTopicSubscriber("secondObserver");
        EmailTopicSubscriber thirdObserver = new EmailTopicSubscriber("thirdObserver");

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        topic.postMessage("Hello Subscribers!");
    }
}
