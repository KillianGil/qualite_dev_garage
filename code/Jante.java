package code;

import java.util.Objects;

public enum Jante {
    TREIZE_POUCES{
        String nameToString() {
            return "TREIZE_POUCES";
        }
    },
    QUATORZE_POUCES{
        String nameToString() {
            return "QUATORZE_POUCES";
        }
    },
    QUINZE_POUCES{
        String nameToString() {
            return "QUINZE_POUCES";
        }
    },
    SEIZE_POUCES{
        String nameToString() {
            return "SEIZE_POUCES";
        }
    },
    DIX_SEPT_POUCES{
        String nameToString() {
            return "DIX_SEPT_POUCES";
        }
    },
    DIX_HUIT_POUCES{
        String nameToString() {
            return "DIX_HUIT_POUCES";
        }
    },
    DIX_NEUF_POUCES{
        String nameToString() {
            return "DIX_NEUF_POUCES";
        }
    },
    VINGT_POUCES{
        String nameToString() {
            return "VINGT_POUCES";
        }
    },
    VINGT_UN_POUCES{
        String nameToString() {
            return "VINGT_UN_POUCES";
        }
    },
    VINGT_DEUX_POUCES{
        String nameToString() {
            return "VINGT_DEUX_POUCES";
        }
    },
    VINGT_TROIS_POUCES{
        String nameToString() {
            return "VINGT_TROIS_POUCES";
        }
    };

    abstract String nameToString();

    public static Jante findJante(String Taillejante){
        for (Jante jante : Jante.values()) {
            if (Objects.equals(jante.nameToString(), Taillejante.toUpperCase())) {
                return jante;
            }
        }
        return null;
    }
}
