package day02_07_06_2022;

import java.util.Scanner;


public class SingleIfSmallTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter temp");

      int temp = scanner.nextInt();

      /*
      after if statement if you use one statement you dont need to use{}
       */


              if (temp >= 70 && temp <=80){ // will print what is inside the brackets just if it's true
                  System.out.println("ideal temp");
                  System.out.println(temp);
              }
        if(temp>=70 && temp<=80)
            System.out.println("ideal temp");
        System.out.println(temp);//if no brackets and if it's false will print just the second or the rest
    }

}
