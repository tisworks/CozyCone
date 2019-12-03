package entities;

import contracts.ConeType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalconyConeTest {
    Cone balconyCone;

    @BeforeEach
    void setUp() throws contracts.ConeTypeNotFoundException {
        balconyCone = ConeFactory.build(ConeType.Balcony);
    }

    @Test
    void getCheckoutPrice() {
        balconyCone.numDailies = 20;
        balconyCone.numPartyDailies = 30;

        assertEquals(36580, balconyCone.getCheckoutPrice());
    }
}