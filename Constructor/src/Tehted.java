public class Tehted {

    public static void help() {
        System.out.println("Kasutus nt: liitmine 2 3");
    }

    public static void main(String[] args) {
        if (!(args.length == 3)) {
            help();
            System.exit(-1);
        }
        double x1 = Double.valueOf(args[1]);
        double x2 = Double.valueOf(args[2]);
        Calc c = new Calc(x1, x2);

        switch (args[0]) {
            case "liitmine":
                System.out.println("+ = " + c.liitmine());
            case "lahutamine":
                System.out.println("- = " + c.lahutamine());
            case "korrutamine":
                System.out.println("* = " + c.korrutamine());
            case "jagamine":
                System.out.println("/ = " + c.jagamine());
            default:
                System.out.println("Valitud operatsioon pole toetatud.");
        }
    }
}
