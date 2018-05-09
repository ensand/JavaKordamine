public class Main {
    public static void main(String[] args) {
        int arv = 16;
        KalkulaatorInterface calc = new DeclarationInterface();  // Interface'is peavad olema k6ik meetodid kirjeldatud, PUBLIC.
        System.out.println(calc.ruut(arv));
        System.out.println(calc.aste(arv, 3));
        System.out.println(calc.ruutjuur(arv));
        System.out.println(calc.juur(arv, 2));

        KalkulaatorAbstract calc2 = new DeclarationAbstract();  // Abstract on nagu poolik klass, osad meetodid ei pea olema kirjeldatud.
        System.out.println(calc2.ruut(arv));
        System.out.println(calc2.aste(arv, 3));
        System.out.println(calc2.ruutjuur(arv));
        System.out.println(calc2.juur(arv, 2));
    }
}
