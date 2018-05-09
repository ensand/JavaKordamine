class Ring extends Shape {

    int r;

    Ring(int raadius) {
        r = raadius;
    }

    public double ymberm66t() {
        return (double) (Math.PI * r * 2);
    }

    public double pindala() {
        return (double) (Math.PI * Math.pow((double) r, 2.0));
    }

}
