package day06_08_03_2022;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {
        /*
        Write a method that can remove  all extra space from String

    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java
         */
        String str = "Hello world      I      love      Java    ";
        String result = removeSpaces(str);
        System.out.println("result: " + result);


    }

  public static String removeSpaces(String str){
        str=str.trim();
String[] s = str.split(" ");
      System.out.println(Arrays.toString(s));

      String result = "";
      for (String each : s) {
          if (!each.isEmpty()) {
              each = each.trim();
              result += each + " ";

          }

      }
        return result;
      }
  }





