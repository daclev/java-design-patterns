import com.daclev.*;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void publisherTest() {
        ConcretePublisher concretePublisher = new ConcretePublisher();
        ConcreteSubscriberA conA = new ConcreteSubscriberA(concretePublisher);
        ConcreteSubscriberB conB = new ConcreteSubscriberB(concretePublisher);
        ConcreteSubscriberC conC = new ConcreteSubscriberC(concretePublisher);

        concretePublisher.someUpdate();
    }
}
