package entities;

import contracts.ConeType;
import contracts.ConeTypeNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleConeTest {
    Cone simpleCone;

    @BeforeEach
    void setUp() throws ConeTypeNotFoundException {
        simpleCone = ConeFactory.build(ConeType.Simple);
    }

    @Test
    void getCheckoutPrice() {
        simpleCone.numDailies = 20;
        simpleCone.numPartyDailies = 30;

        assertEquals(27240‬, simpleCone.getCheckoutPrice());
    }
}