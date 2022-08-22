package day06_08_03_2022;

public class ArmstrongNumber {
    /*
     Write a method that can check if a number is Armstrong number
				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

				Armstrong numbers are     === 153 370 371 407 === for 3 digits
     */
    /*
    1*1*1 =1
    3*3*3=27
    5*5*5 =125
    125+27+1 =153
     */

    public static void main(String[] args) {
        boolean isArmstrongNumber = isArmstrong(153);

        System.out.println(isArmstrongNumber);

    }

    public static boolean isArmstrong(int num) {
        //you can convert number to string and you can get the numbers with split
        //you can use a wrapper classes
        int lastDigit = num % 10;
        System.out.println(lastDigit);
 //second digit
       int result = num / 10; //num will be 15 result = 153/10 ->15
       int  secondDigit = num % 10;//15%10=>5
        System.out.println("secondDigit " + secondDigit);
//third digit
    /*   int thirdDigit = result/100;//153/100 =1
        int total = (lastDigit*lastDigit*lastDigit) +(secondDigit*secondDigit*secondDigit)+(thirdDigit*thirdDigit*thirdDigit);
       */
        int total = ( int)(Math.pow(lastDigit, 3)+Math.pow(lastDigit, 3)+Math.pow(lastDigit, 3));





        if(total ==num){
            return true;
        }else{
            return false;
        }



    }
}








