import com.daclev.*;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    /**
     * One-to-Many loose couplying between subject (publisher) and observers (subscribers).
     */
    @Test
    void observerPatternTest() {
        ConcreteSubject conPub = new ConcreteSubject();
        ConcreteSubscriber conSubscriberA = new ConcreteSubscriber("conA");
        ConcreteSubscriber conSubscriberB = new ConcreteSubscriber("conB");
        ConcreteSubscriber conSubscriberC = new ConcreteSubscriber("conC");

        conPub.registerObserver(conSubscriberA);
        conPub.registerObserver(conSubscriberB);
        conPub.registerObserver(conSubscriberC);

        conPub.broadcastUpdate();
        conPub.unregisterObserver(conSubscriberA);
        conPub.broadcastUpdate();
    }

    /**
     * Pub-Sub usually have no coupling.
     * A third component such as a event bus/message broker uses filters to publish messages
     * to provide to subscribers.
     */
    @Test
    void pubSubPatternTest() {
        ConcreteSubject conPub = new ConcreteSubject();
        ConcreteSubscriber conA = new ConcreteSubscriber("conA");
        conPub.registerObserver(conA);
        conPub.updateObserver("conA");
        conPub.unregisterObserver(conA);
    }
}
