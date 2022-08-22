package day02_07_06_2022;

public class MultiIfSmallTask {
    public static void main(String[] args) {
        /*
         /*    ( Scanner Class can be used )


                            BMI (Body Mass Index): Program will ask user to enter their mass (kilogram) and their height (meters).
                            Calculate their BMI and then print the appropriate message based on the provided values:
                                All numbers taken as doubles

                                —> BMI Formula: BMI = mass / height^2
                                —> Values:

                                    Less than 18.5 — Underweight
                                    From 18.5 to 25 — Normal weight
                                    From 25 to 30 — Overweight
                                    More than or equal to 30 — Obese

                                     Output :  Underweigth    or    Normal weight    or   etc.

                         */

        int number = 10;
        /*
        number smaller than 0 print invalid
        number between 1 and 3  print good
        number between 4 and 7 print  better
        number than 8 print best
         */
    if(number<=0){
        System.out.println("invalid");
    }else if( number >=1 && number <=3){
        System.out.println("good");
    }else if(number >=4 &&number<=7){
        System.out.println("better");
    }else if(number >=8){
        System.out.println("best");
    }else{
        System.out.println("invalid");
    }

    /// or we can use and the second one is prefered for interviw, it's show what we know what if statement test in order and stops at first true
        if(number>=8){
            System.out.println("best");
        }else if(number >=4){
            System.out.println("better");
        }else if(number>=1){
            System.out.println("good");
        }else {
            System.out.println("invalid");
        }




    }


}
