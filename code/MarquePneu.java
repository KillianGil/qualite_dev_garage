package code;

import java.util.Objects;

public enum MarquePneu {
    MICHELIN{
        String nameToString() {
            return "MICHELIN";
        }
    },
    GOODYEAR{
        String nameToString() {
            return "GOODYEAR";
        }
    },
    BRIDGESTONE{
        String nameToString() {
            return "BRIDGESTONE";
        }
    },
    PIRELLI{
        String nameToString() {
            return "PIRELLI";
        }
    },
    CONTINENTAL {
        String nameToString() {
            return "CONTINENTAL";
        }
    };

    abstract String nameToString();

    public static MarquePneu findMarquePneu(String marque){
        for (MarquePneu marquePneu : MarquePneu.values()) {
            if (Objects.equals(marquePneu.nameToString(), marque.toUpperCase())) {
                return marquePneu;
            }
        }
        return null;
    }
}
