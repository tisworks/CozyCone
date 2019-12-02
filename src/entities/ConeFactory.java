package entities;

import contracts.ConeType;
import contracts.ConeTypeNotFoundException;

public class ConeFactory {
    public static Cone build(ConeType type) throws ConeTypeNotFoundException {
        switch (type) {
            case Simple:
                return new SimpleCone();
            case Balcony:
                return new BalconyCone();
            default:
                throw new ConeTypeNotFoundException();
        }
    }
}
