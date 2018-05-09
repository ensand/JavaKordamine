import static java.lang.Integer.*;

public class Numbers {

    public static String binary(Integer num) {
        return toBinaryString(num);
    }

    public static String oct(Integer num) {
        return toOctalString(num);
    }

    public static String hex(Integer num) {
        return toHexString(num);
    }

    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);
        System.out.println(arg + " in binary is " + binary(arg) + ", in octal is " + oct(arg) + ", in hexadecimal is " + hex(arg) + ".");
    }
}
