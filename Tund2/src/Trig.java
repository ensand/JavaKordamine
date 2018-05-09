import static java.lang.Math.*;

public class Trig {
    public static double sinValue(double x) {
        return sin(x);
    }

    public static double cosValue(double x) {
        return cos(x);
    }

    public static double tanValue(double x) {
        return tan(x);
    }

    public static double kraadToRad(double kraad) {
        return kraad * (PI/180);
    }

    public static double radOrKraad(char unit, double num) {
        if (unit == 'r') {
            return num;
        } else {
            System.out.println("Tere2");
            return kraadToRad(num);
        }
    }

    public static Double sct(String arg, char unit, double num){
        switch (arg) {
            case "sin":
                return sinValue(radOrKraad(unit, num));
            case "cos":
                return cosValue(radOrKraad(unit, num));
            case "tan":
                return tanValue(radOrKraad(unit, num));
            default:
                System.out.println("Learn your trigonometry, peasant.");

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(args[0] + " vaartus on " + sct(args[0], args[1].charAt(0), Double.parseDouble(args[2])));
    }
}