package producer;

import dispatcher.Dispatcher;
import event.AngryEvent;
import event.HappyEvent;

public class Producer {

    public void sendEventsToDispatcher(Dispatcher dispatcher) {
        dispatcher.sendEvent(new HappyEvent());
        dispatcher.sendEvent(new HappyEvent());
        dispatcher.sendEvent(new HappyEvent());
        dispatcher.sendEvent(new AngryEvent());
        dispatcher.sendEvent(new AngryEvent());
    }
}
