package entities;

import contracts.IObserverClient;

public class Client implements IObserverClient {

    @Override
    public void update() {
        System.out.println("Notification received");
    }
}
