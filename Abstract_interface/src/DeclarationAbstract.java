public class DeclarationAbstract extends KalkulaatorAbstract {

    double ruut(int x) {
        return Math.pow(x, 2.0);
    }

    double aste(int x, int a) {
        return Math.pow(x, a);
    }

    double ruutjuur(int x) {
        return Math.sqrt(x);
    }

    double juur(int x, int a) {
        return Math.pow(x, (1.0/a));
    }
}


