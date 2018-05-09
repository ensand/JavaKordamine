class Multiply implements Equations {

    private int x;
    private int y;

    @Override
    public int liitmine(int x, int y) {
        return x + y;
    }

    @Override
    public int liitmine() {
        return 0;
    }

    @Override
    public int korrutamine(int x, int y) {
        return x * y;
    }

    @Override
    public int korrutamine() {
        return 0;
    }
}
