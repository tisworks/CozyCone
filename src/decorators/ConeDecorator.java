package decorators;

import entities.Cone;

public class ConeDecorator extends Cone {
    protected Cone cone;

    public ConeDecorator(Cone cone) {
        this.cone = cone;
    }

    public double getCheckoutPrice() {
        return cone.getCheckoutPrice();
    }
}
