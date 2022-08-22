package day05_07_27_2022;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        /*
         */

    String colors = "Yellow Blue Black";
    String[] colorArray = {"Yellow", "Blue", "Black"} ;

        System.out.println("ColorArray[0] = " + colorArray[0]);
        System.out.println("ColorArray[1] = " + colorArray[1]);
        System.out.println("ColorArray[2] = " + colorArray[2]);


        colorArray[1] = "White";
        System.out.println("ColorArray[1] = " + colorArray[1]);
        String[] names = new String[5];
        names[0] = "Adam";
        names[1] = "Rabia";
        names[2] = "Nick";
        names[3] = "Busra";
        names[4] = "Sidar";
        //names[5] = "Milena"; we can't do this, if we will add will get ArrayIndexOutOfBoundsException
        System.out.println("names[3] = " + names[3]);

        String[] names2 = new String[10];

        // how to white the elements of array
        System.out.println(Arrays.toString(names));
 int[] nums1 = {1, 2, 3, 4};
 int[] nums2 = {2, 4, 3, 1};
 // how ti compere the arrays
        System.out.println(Arrays.equals(nums1, nums2));//false

        Arrays.sort(nums2);
        Arrays.sort(nums1);
        System.out.println(Arrays.equals(nums1, nums2));//true

        System.out.println("====================");

        String brand = "Gucci";
        char[] chars =  brand.toCharArray();
        System.out.println(chars[2]);//c
        System.out.println(chars[4]);//i

        //if you want to split string we use split()

        String[] charsString = brand.split("");
        String sentence = "I like playing Football games";
        String[] sentence1 = sentence.split(" ");
        System.out.println(Arrays.toString(sentence1));

String str = "abdknsbviubndc";
String[] bs = str.split("b");
        System.out.println(Arrays.toString(bs));



        str.toCharArray();
//assign short cut
        //Mac: option +enter
        //windows: alt + enter

    }
}
