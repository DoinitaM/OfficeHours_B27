package day04_07_20_2022;

public class T5_Loop {
    public static void main(String[] args) {
       /* ask 5 :For Loop Intro
                - Print out Cybertek's characters one by one  */
        String s = " Cybertek";

        char fist = s.charAt(0);
        char second = s.charAt(1);
        char third = s.charAt(2);
        char fourth = s.charAt(3);
        char five = s.charAt(4);
        char six = s.charAt(5);
        char seven= s.charAt(6);

  // for(int i = starting point; i < ending point; i++)

        for(int i = 0; i<=s.length()-1; i++){

            char ch = s.charAt(i);
            System.out.println( i + ". ch - " + ch);
          //  System.out.print(s.charAt(i) + " ");

           // or System.out.println(s.charAt(i));
        }
     //   System.out.println();
    }
}
