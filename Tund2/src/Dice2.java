import java.util.Random;

public class Dice2 {

    public static int[] randomGenCount(int visked) {
        int[] numList = new int[6]; // num list, miiles on 6 elementi, mille v22rtused on vaikimisi 0
        Random num = new Random();
        for (int i = 0; i < visked; i ++) {
            int n = num.nextInt(6) + 1; // 6 on max, 1 on min
            switch (n) {
                case 1:
                    numList[0] += 1;
                    break;
                case 2:
                    numList[1] += 1;
                    break;
                case 3:
                    numList[2] += 1;
                    break;
                case 4:
                    numList[3] += 1;
                    break;
                case 5:
                    numList[4] += 1;
                    break;
                case 6:
                    numList[5] += 1;
                    break;
                default:
                    System.out.println("Something fucky is " + n);
                    break;
            }
        }
        return numList;
    }
    
    public static void listPrinter(int num) {
        int[] nums = randomGenCount(num);
        for(int i = 0; i<6; i++){
            System.out.println("Arvu " + (i+1) + " oli " + nums[i] + " korda.");
        }
    }

    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);
        listPrinter(arg);
    }
}
