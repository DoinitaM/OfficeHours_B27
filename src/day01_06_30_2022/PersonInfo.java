package day01_06_30_2022;

public class PersonInfo {
    // Task1
    /*
    this is for
    comment
     */

    public static void main(String[] args) {
        /**
         *  primitive data types
         *   intiger(Numeric) : byte, short, int, long
         *   decimal(Floating): float, double
         *   character: char
         *   boolean: boolean
         non-primitive data types:

         String

         */

        String name; //only declaring
        name = "Ana";
        String name2 = "Adam"; //declare the variable
        byte age = 35;
        char gender = 'F';
        boolean isStudent = true;
        short numberOfSiblings = 1;
        long myFavoriteNumber = 35;
        double birthDate = 01.14;
        int year = 2022;
        // String full birthday date with year
        String fullBirthday =  birthDate+ "." + year;
        System.out.println(fullBirthday);
        System.out.println("fullBirthday = " + fullBirthday);
        System.out.println("name = " + name);
        System.out.println("name2 = " + name2);
        System.out.println("age = " + age);
        System.out.println("gender= " + gender);
        System.out.println("isStudent = " + isStudent);
        System.out.println("numerOfSiblings = " + numberOfSiblings);
        System.out.println("myFavoriteNumber = " + myFavoriteNumber);


        //String fullBirthday2 = birthDate + year + " ";//wrong
       // System.out.println(fullBirthday2);

      //  System.out.println(birthDate  + year); // wrong
     //   String dateOfBirth = birthDate + "."+ year; // Ageel...right

int num1 = 1;
int num2 = 3;
int total = num1 + num2; //4
String result = " " + num1+ num2; // 13 or 4-> will be 13 the copiler just put together ( nu le aduna)
        System.out.println("result = " + result);
        System.out.println(total); //4

        String result2 = num1 + num2 + " "; // 4 -> it's correct answer
        System.out.println(result2);
        System.out.println("\t"); // tab
        System.out.println("\n");
        System.out.println("\"");
        System.out.println("\\");
       int hour = 2;
        int min = 10;
        int sec = 23;

        System.out.println(hour + ":" + min +":" + sec);


        /*
        int + int -> addition
        String + int -. concant return String abc + 1 -> abc1
        int + String -> concat
        int + double -> addition
         */
    }

}
