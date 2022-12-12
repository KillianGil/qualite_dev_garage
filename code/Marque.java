package code;

public enum Marque {
    ALPHAROMEO {
        String nameToString() {
            return "ALPHAROMEO";
        }
    },
    AUDI {
        String nameToString() {
            return "AUDI";
        }
    },
    BMW {
        String nameToString() {
            return "BMW";
        }
    },
    FIAT {
        String nameToString() {
            return "FIAT";
        }
    },
    FORD {
        String nameToString() {
            return "FORD";
        }
    },
    NISSAN {
        String nameToString() {
            return "NISSAN";
        }
    },
    PEUGEOT {
        String nameToString() {
            return "PEUGEOT";
        }
    },
    TOYOTA {
        String nameToString() {
            return "TOYOTA";
        }
    },
    TESLA {
        String nameToString() {
            return "TESLA";
        }
    },
    MERCEDES {
        String nameToString() {
            return "MERCEDES";
        }
    },
    RENAULT {
        String nameToString() {
            return "RENAULT";
        }
    };

    abstract String nameToString();
}
