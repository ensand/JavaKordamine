class Risttahukas {

    private double pikkus;
    private double laius;
    private double k6rgus;

    Risttahukas(double pikkus, double laius, double k6rgus) {
        this.pikkus = pikkus;
        this.laius = laius;
        this.k6rgus = k6rgus;
    }

    Risttahukas(double pikkus) {
        this.pikkus = pikkus;
        laius = 0;
        k6rgus = 0;
    }

    String stringiks() {
        return "Pikkus " + pikkus + "\nLaius " + laius + "\nK6rgus " + k6rgus;
    }

    String stringiksPLK(String v) {
        if (v.equalsIgnoreCase("pikkus")) {
            return "" + pikkus;
        } else if (v.equalsIgnoreCase("laius")) {
            return "" + pikkus;
        } else if (v.equalsIgnoreCase("k6rgus")) {
            return "" + k6rgus;
        } else {
            return "Ei leidnud vajalikku s6na.";
        }
    }

}
