public class IsikuAndmed {

    public static void main(String[] args) {
        Isik1 i = new Isik1("Enola", 175);
        Isik2 j = new Isik2();

        System.out.println("Isikunimi " + i.nimi);
        System.out.println("Isiku pikkus " + i.pikkus);
        System.out.println(j.nimi + j.pikkus);
    }

}
