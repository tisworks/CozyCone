package entities;

public class BalconyCone extends Cone {
    private static final double PARTY_INCREASE = 1.3;
    private static final double CONE_VALUE = 620.0;

    public BalconyCone() {
        this.price = CONE_VALUE;
    }

    @Override
    public double getCheckoutPrice() {
        return (numDailies * price) + (numPartyDailies * (price * PARTY_INCREASE));
    }
}
