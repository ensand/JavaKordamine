public class Ex1 {

    public static int[] numList(String[] args) {
        int[] list = new int[5];

        try {
            for (int i = 0; i < 5; i++) {
                list[i] = (Integer.parseInt(args[i]));
                //System.out.println(list[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Unacceptable input");
            e.printStackTrace();
        }
        return list;
    }

    public static void printNumSum(int[] list) {
        int sum = 0;
        for (int i = 0; i < 5; i++){
            System.out.println(list[i]);
            sum += list[i];
        }
        System.out.println("Numbrite summa on " + sum);
    }


    public static void main(String[] args) {
        numList(args);
        printNumSum(numList(args));
    }
}
