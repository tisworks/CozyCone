package entities;

public abstract class Cone {
    protected int numDailies;
    protected int numPartyDailies;
    protected double price;
    protected Client client;

    public abstract double getCheckoutPrice();

    public int getTotalDailies() {
        return numDailies + numPartyDailies;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
