package day03_07_13_2022;

public class SimpleCalculatorSwitch {
    public static void main(String[] args) {
        /*
         Task 1:Get two numbers and operator
        Create simple calculator
        case 1 +
        case 2 *
        case 3 -
        case 4 /
        default:
         */
     int num1 = 10;
     int num2 = 14;
     char ch = '+';
     int results = 0;

     switch (ch){
         case '+':
             results = num1 + num2;
             break;
         case '-' :
             results = num1 - num2;
             break;
         case'*':
             results = num1*num2;
             break;
         case'/':
             results = num1/num2;
             break;
         default:
             results = 0;
             System.out.println("invalid operator");
             break;


     }
        System.out.println(results);

    }
}
