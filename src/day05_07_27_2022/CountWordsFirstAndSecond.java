package day05_07_27_2022;

public class CountWordsFirstAndSecond {
    public static void main(String[] args) {
        /*
         Write a program that accepts String array.Count how many names have the same first and last letter

				Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

				Output : 4
         */

        String[] arr = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
int count = 0;
        for (String name : arr){
           // first character
            String first = name.charAt(0) + "";

            //last character
            String last = name.charAt(name.length()-1) + "";
            //if character are the same count it
            if(first.equalsIgnoreCase(last)){
                count++;
                System.out.println("name = " + name);
            }
        }

        System.out.println("count: " + count);


    }
}
