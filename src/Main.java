import consumer.Consumer;
import dispatcher.Dispatcher;
import event.AngryEvent;
import event.HappyEvent;
import producer.Producer;
import producer.Producer2;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher=new Dispatcher();
        Producer producer=new Producer();
        Producer2 producer2=new Producer2();
        Consumer consumer=new Consumer("Roxana");
        Consumer consumer1=new Consumer("Ana");
        dispatcher.registerConsumerToEvents(consumer,new AngryEvent());
        dispatcher.registerConsumerToEvents(consumer,new HappyEvent());
        dispatcher.registerConsumerToEvents(consumer1,new AngryEvent());
        producer.sendEventsToDispatcher(dispatcher);
        producer2.sendEventsToDispatcher(dispatcher);

    }
}
