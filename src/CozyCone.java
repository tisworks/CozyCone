import contracts.IObserverClient;
import entities.Client;
import entities.Cone;

import java.util.ArrayList;

public class CozyCone {
    private static final int NUM_CONES_START_VAlUE = 30;

    private ArrayList<IObserverClient> waitingList;
    private int numCones;
    private CozyCone instance;

    private CozyCone(int numCones) {
        this.numCones = numCones;
        waitingList = new ArrayList<>();
    }

    public CozyCone get() {
        if (instance == null)
            instance = new CozyCone(NUM_CONES_START_VAlUE);
        return instance;
    }

    public void checkin(Client client, Cone cone) {
        if (numCones == 0)
            waitingList.add(client);
        else {
            cone.setClient(client);
            numCones--;
        }
    }

    public void checkout(Cone cone) {
        cone.setClient(null);
        numCones++;

        if (!waitingList.isEmpty()) {
            for (IObserverClient client : waitingList) {
                client.update();
                waitingList.remove(client);
            }
        }

        System.out.println("Price to be paid: " + cone.getCheckoutPrice());
    }
}
