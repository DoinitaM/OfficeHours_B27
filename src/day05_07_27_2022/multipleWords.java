package day05_07_27_2022;

public class multipleWords {
    public static void main(String[] args) {
        /*
        Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
        		 trash can
         		 dish washer
         */
        String sentence  = " knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer" ;
                String[] words = sentence.split(", ");
         //get element one by one
        for(String element : words){
            // if the element contains " " it means multiple worde
            if(element.contains(" "))
                System.out.println(element);
        }


    }
}
