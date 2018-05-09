class Kuup extends Shape {

    int length;

    Kuup(int xCord, int yCord, int sizeLength) {
        x = xCord;
        y = yCord;
        length = sizeLength;
    }

    public double ymberm66t() {
        return (double) (4 * length);
    }

    public double pikkus () {
        return length;
    }

    public double pindala() {
        return (double) (length * length * 6);
    }
}
