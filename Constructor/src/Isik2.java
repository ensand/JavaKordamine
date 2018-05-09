public class Isik2 {

    String nimi;
    double pikkus;
    Isik2(String nimi, double pikkus) {
        this.nimi = nimi;
        this.pikkus = pikkus;
    }

    Isik2() {
        nimi = "Te ei sisestanud nime.";
        pikkus = -1.0;
    }

    Isik2(double isikuPikkus) {
        this("Enola Sander", isikuPikkus);
    }

}
