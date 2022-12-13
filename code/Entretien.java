package code;

import java.util.Objects;

public enum Entretien {
    NEUVE{
        String nameToString() {
            return "NEUVE";
        }
    },
    ENTRETENUE{
        String nameToString() {
            return "ENTRETENUE";
        }
    },
    PASENTRETENUE{
        String nameToString() {
            return "PASENTRETENUE";
        }
    },
    ABIME{
        String nameToString() {
            return "ABIME";
        }
    },
    EPAVE{
        String nameToString() {
            return "EPAVE";
        }
    };

    abstract String nameToString();

    public static Entretien findEntretien(String marque){
        for (Entretien entretien : Entretien.values()) {
            if (Objects.equals(entretien.nameToString(), marque.toUpperCase())) {
                return entretien;
            }
        }
        return null;
    }
}
