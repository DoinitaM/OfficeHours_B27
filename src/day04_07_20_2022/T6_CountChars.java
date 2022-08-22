package day04_07_20_2022;

public class T6_CountChars {
    public static void main(String[] args) {
        /*
        Task 6 : Count upper, lower, and numbers

					        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
					        Input: 2juMp41EEkd4s4
					        Output:
					        3 uppercase letters   result : MEE
					        6 lowercase letters   result : jupkds
					        5 numbers             result : 24144
         */

        String str = "2juMp41EEkd4s4";
        int countLower = 0;
        int countUpper = 0;
        int countNumber = 0;

 String resultNumber ="";
 String resultLower = "";
 String resultUpper = "";


        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > 'a' && ch < 'z') {
                countLower++;
                resultLower+=ch;
            } else if (ch > 'A' && ch < 'Z') {
                countUpper++;
                resultUpper+=ch;
            }else if (ch > '0' && ch < '9') {
                countNumber++;
                resultNumber +=ch;
            }

        }
        System.out.println("CountNumber: " + countNumber);
        System.out.println("Count Lower: " + countLower);
        System.out.println("Count Upper: " + countUpper);

        System.out.println("resultLower: " + resultLower);
        System.out.println("resultUpper: " +resultUpper);
        System.out.println("resultNumber: " + resultNumber);

    }
}
