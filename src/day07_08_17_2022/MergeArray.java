package day07_08_17_2022;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9};
        int[] d = {10, 11, 12};
        int[] merged = mergeArray(a, b);
int[] merged2 = mergeArray(a, b, c);
        System.out.println("merged: " + Arrays.toString(merged)); // [1, 2, 3, 4, 5, 6]

     //   int[] merged2 = mergeArray(a, b, c);
        System.out.println("merged2: " + Arrays.toString(merged2));

    }

    private static int[] mergeArray(int[] a, int[] b) {
        //i need to create one dummy array
        int[] dummy = new int[a.length + b.length];

        // i need to put my first array into dummy
        int index = 0;
        for (int each : a) {
            dummy[index++] = each;

        }
        //int[] dummy = { 1, 2, 3}
        // i nedd to put my second array into dummy
        for (int each : b) {
            dummy[index++] = each;
        }
        return dummy;
    }

    private static int[] mergeArray(int[] a, int[] b, int[] c) {
        //i need to create one dummy array
        int[] dummy = new int[a.length + b.length + c.length];

        // i need to put my first array into dummy
        int index = 0;
        for (int each : a) {
            dummy[index++] = each;

        }
        //int[] dummy = { 1, 2, 3}
        // i nedd to put my second array into dummy
        for (int each : b) {
            dummy[index++] = each;
        }
        // i nedd to put my third array into dummy
        for (int each : c) {
            dummy[index++] = each;
        }
        return dummy;


        /*public static int[] mergeArray(int[] a, int[] b, int []c ){
            int[] ints = mergeArray(a, b);//{1,2,3,4,5,6}
            mergeArray(ints, c);//{1,2,3,4,5,6,  7,8,9}
          //  int[] merge2 = mergeArray(a, b);

           return  mergeArray(mergeArray(a,b), c);

        }
*/

    }
}