package day06_08_03_2022;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first number");
        int num1 = input.nextInt();
        System.out.println("second number");
        int num2 = input.nextInt();

        add(num1, num2);
        devide(num1, num2);
        substract(num1, num2);
        multiply(num1, num2);


        System.out.println("add: "+ add(num1, num2) );
        System.out.println("devide: "+ devide(num1, num2) );
        System.out.println("substract: "+ substract(num1, num2) );
        System.out.println("multiply: "+ multiply(num1, num2) );
    }

    public static int multiply(int num1, int num2){
        return  num1 * num2;

    }


    public static int devide(int num1, int num2){
        return num1 / num2;
    }

    public static int add(int num1, int num2){
        return num1 + num2;

    }

    public static int substract(int num1, int num2){
        return num1 - num2;
    }
}





