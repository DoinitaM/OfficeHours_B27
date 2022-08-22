package day05_07_27_2022;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        /*
         Write a program that accepts an array and prints an array with the elements "rotated left”

		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]
         */

     String sentence = "I like playing Football, Tenis";
     sentence.replace(",", "");
    String[] word =  sentence.split(" ");
        System.out.println(Arrays.toString(word));

        /*
        put 1 in another variable
        1 2 3
        2 2 3
        2 3 3
        2 3 1
         */
int [] x = {1, 2, 3};

    int var = x[0];
    x[0] = x[1];
    x[1] = x[2];

        for (int i = 0; i <x.length-1; i++) {
           // at the last  x.length-2   i+1=x.length-1
                 x[i]=                    x[i+1];

        }
        x[x.length-1] = var;

        System.out.println("Arrays.toString(X) = " + Arrays.toString(x));




    }
}
