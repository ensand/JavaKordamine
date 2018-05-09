public class DeclarationInterface implements KalkulaatorInterface {

    public double ruut(int x) {
        return Math.pow(x, 2.0);
    }

    public double aste(int x, int a) {
        return Math.pow(x, a);
    }

    public double ruutjuur(int x) {
        return Math.sqrt(x);
    }

    public double juur(int x, int a) {
        return Math.pow(x, (1.0/a));
    }
}
