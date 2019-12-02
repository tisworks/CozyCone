package decorators;

import entities.Cone;

public class ConeFridge extends ConeDecorator {
    private static final double FRIDGE_VALUE = 40.0;

    public ConeFridge(Cone cone) {
        super(cone);
    }

    @Override
    public double getCheckoutPrice() {
        return super.getCheckoutPrice() + (cone.getTotalDailies() * FRIDGE_VALUE);
    }
}
