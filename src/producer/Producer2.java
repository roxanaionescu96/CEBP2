package producer;

import dispatcher.Dispatcher;
import event.HappyEvent;

public class Producer2 {
    public void sendEventsToDispatcher(Dispatcher dispatcher) {
        dispatcher.sendEvent(new HappyEvent());
    }
}
