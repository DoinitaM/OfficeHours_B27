package day02_07_06_2022;

public class TernaryTask {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        /*
        ? -> if statement
        : -> else statement

         */
String result =   a > b? // if(a>b)
  "bigger"       // if correct
     : //else     //it means is not correct
     "less"  ;
                //if//else
int result2 = a>b?a:b;


System.out.println(result);
        System.out.println(result2);
    }
}
