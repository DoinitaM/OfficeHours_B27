package day06_08_03_2022;

public class PrimeNumber {
    /*
    Write a method that can check if a number is prime or not

				Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1
     */

    public static void main(String[] args) {
        int num = 5;
        boolean isPrimeNumber = isPrime(num);
        for (int i = 1; i < 100; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }



      //  System.out.println(isPrimeNumber);
    }

    private static boolean isPrime(int num){
        //we need to check number greater than 1
        if(num<2){
            return false;
        }
        for (int i = 2; i <num; i++) {
            if(num%i ==0){
                return false;
            }
          // return true;
        }

       return true; //we need to check numbers from 2 to itself
    }




}
