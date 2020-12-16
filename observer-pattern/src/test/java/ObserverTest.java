import com.daclev.*;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void observerPatternTest() {
        ConcretePublisher conPub = new ConcretePublisher();
        ConcreteSubscriber conA = new ConcreteSubscriber("conA");
        ConcreteSubscriber conB = new ConcreteSubscriber("conB");
        ConcreteSubscriber conC = new ConcreteSubscriber("conC");

        conPub.registerObserver(conA);
        conPub.registerObserver(conB);
        conPub.registerObserver(conC);

        conPub.broadcastUpdate();
        conPub.unregisterObserver(conA);
        conPub.broadcastUpdate();
    }

    @Test
    void pubSubPatternTest() {
        ConcretePublisher conPub = new ConcretePublisher();
        ConcreteSubscriber conA = new ConcreteSubscriber("conA");
        conPub.registerObserver(conA);
        conPub.updateObserver("conA");
        conPub.unregisterObserver(conA);
    }
}
