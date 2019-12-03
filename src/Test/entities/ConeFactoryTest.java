package entities;

import contracts.ConeType;
import contracts.ConeTypeNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConeFactoryTest {
    @Test
    void build() throws ConeTypeNotFoundException {
        assertTrue(ConeFactory.build(ConeType.Simple) instanceof SimpleCone);
        assertTrue(ConeFactory.build(ConeType.Balcony) instanceof BalconyCone);
    }
}