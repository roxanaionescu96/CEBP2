package dispatcher;

import consumer.Consumer;
import event.IEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dispatcher {

    private Map<String, ArrayList<Consumer>> eventsWithConsumers=new HashMap<>();

    public void registerConsumerToEvents(Consumer consumer, IEvent event) {
        if (eventsWithConsumers.get(event.toString())==null) {
            ArrayList<Consumer> consumers = new ArrayList<>();
            consumers.add(consumer);
            eventsWithConsumers.put(event.toString(), consumers);
        } else {
            ArrayList<Consumer> consumers=eventsWithConsumers.get(event.toString());
            consumers.add(consumer);
            eventsWithConsumers.put(event.toString(), consumers);
        }
    }
    public void sendEvent(IEvent event) {
        eventsWithConsumers.get(event.toString()).forEach(consumer -> consumer.fireEvent(event));
    }
}
