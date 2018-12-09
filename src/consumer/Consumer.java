package consumer;

import event.IEvent;

public class Consumer {
    private String name;

    public Consumer(String name) {
        this.name = name;
    }
    public void fireEvent(IEvent event) {
        System.out.println("Name of consumer "+this.name+ " and the event " +event.toString());
    }
}
