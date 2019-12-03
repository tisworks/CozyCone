package decorators;

import contracts.ConeType;
import contracts.ConeTypeNotFoundException;
import entities.Cone;
import entities.ConeFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConeBreakfastTest {
    ConeBreakfast cB;

    @BeforeEach
    void setUp() throws ConeTypeNotFoundException {
        cB = new ConeBreakfast(ConeFactory.build(ConeType.Simple));
    }

    @Test
    void getCheckoutPrice() {

    }
}