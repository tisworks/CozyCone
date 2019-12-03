import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CozyConeTest {
    CozyCone c;
    @BeforeEach
    void setUp() {
        c = c.get();
    }

    @Test
    void get() {
        assertNotNull(c.get());
    }

    @Test
    void checkin() {
    }

    @Test
    void checkout() {
    }
}