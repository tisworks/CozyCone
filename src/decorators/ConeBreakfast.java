package decorators;

import entities.Cone;

public class ConeBreakfast extends ConeDecorator {
    private static final double BREAKFAST_VALUE = 20.0;

    public ConeBreakfast(Cone cone) {
        super(cone);
    }

    @Override
    public double getCheckoutPrice() {
        return super.getCheckoutPrice() + (cone.getTotalDailies() * BREAKFAST_VALUE);
    }
}
