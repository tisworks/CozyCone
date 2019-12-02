package decorators;

import entities.Cone;

public class ConeSPA extends ConeDecorator {
    private static final double SPA_VALUE = 120.0;

    public ConeSPA(Cone cone) {
        super(cone);
    }

    @Override
    public double getCheckoutPrice() {
        return super.getCheckoutPrice() + (cone.getTotalDailies() * SPA_VALUE);
    }
}
