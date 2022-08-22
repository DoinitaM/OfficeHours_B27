package day03_07_13_2022;

public class StringIntro {
    public static void main(String[] args) {

        String str1 = "Cydeo";
        String str2 = "Cydeo";

        String str3 = new String ("Cydeo");
        String str4 = new String("Cydeo");


        //==for string pool
        //equals() or equalsIgnoreCase()

        System.out.println(str1 ==str2);//true
        System.out.println(str1 ==str3);//false
        System.out.println(str3==str4); //false

        System.out.println(str1.equals(str3));//true
        System.out.println(str3.equals(str4));//true
        System.out.println(str1.equals(str2));//true
    }
}
