package day03_07_13_2022;

public class RepeatPartOfString {
    public static void main(String[] args) {



        /*
         1. Create a method return a new string made of 3 copies of the last 2 chars of the original string.The string
        length will be at least 2.

        Input:
        "Hello" →"lololo"
        Input:
        "ab"    →"ababab"
        Input:
        "Hi"   →"HiHiHi"
         */

        String word = "Hello";
        //if you want to get one character you can use charAt()
        char l = word.charAt(2);
        //if you want get some part of your string you ca use substring()

        //if you want to get length of String ->length()

        int length = word.length(); // alt+enter / control+enter

        char lastCh = word.charAt(length-1);
        char secondLast = word.charAt(length-2);

        String el= word.substring(1,3); //el

        String lo = word.substring(3,5); //lo
        //lo // length -2
      // String lo3 = word.substring(beginIndex:length-2 );

        System.out.println(lo + lo+ lo);
       // System.out.println(lo.repeat(count: 3));

    }
}
