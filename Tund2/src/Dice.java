//import java.lang.reflect.Array;
//import java.util.Dictionary;
//import java.util.Random;
//
//public class Dice {
//
//    public static int[] randomGen(int arg) {
//        int[] numList = new int[arg]; //arg-le elemendile loodud täisarvudest list, mille väärtused on vaikimisi 0id
//        Random num = new Random();
//        for (int i = 0; i <= arg; i++) {
//            while (numList[i] == 0) { // numList kohal i, mis igal tsyklil suureneb yhe v6rra, pannakse numlisti; nii kaua kuni listis ei ole yhtegi väärtust, mis on 0
//                Integer n = num.nextInt(6) + 1; // 6 on max ja 1 on min
//                numList.add(n, i);
//            }
//        }
//        return numList;
//    }
//
//    public static Array randomCount(Array numList) { // Func mis loeb mitu korda saadi 1, 2,..., 6; saab sisendiks listi, eelnevast funcist; tagastab dictionary
//        Dictionary count = new
//        Integer one = new Integer();
//    }
//
//
//    public static void main(Integer arg) {
//        // saab sisendiks mitu viset peab tegema
//        System.out.println(randomGen(arg));
//    }
//}
