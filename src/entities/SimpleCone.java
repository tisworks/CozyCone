package entities;

public class SimpleCone extends Cone {
    private static final double PARTY_INCREASE = 1.4;
    private static final double CONE_VALUE = 480.0;

    public SimpleCone() {
        this.price = CONE_VALUE;
    }

    @Override
    public double getCheckoutPrice() {
        return (numDailies * price) + (numPartyDailies * (price * PARTY_INCREASE));
    }
}
