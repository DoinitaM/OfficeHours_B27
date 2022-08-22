package day04_07_20_2022;

public class T1_PutFirstWordToEnd {
    public static void main(String[] args) {
        /*
        Task 1 :     Move first word

					    Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex:
						        // 0123
						    Input: Java is a fun language

						    Output: is a fun language Java

						    Hint: Use indexOf and substring
         */
        String sentence = "Java is a fun language";
        // i need to get first word
        //i need to find my " " indexOf()
        int indexOfFirstSpace = sentence.indexOf(" ");
        String firstWord = sentence.substring(0,indexOfFirstSpace);
        System.out.println(sentence);
        System.out.println("first word: " + firstWord);
        String secondWord = sentence.substring(indexOfFirstSpace +1);
        System.out.println(secondWord + " " + firstWord);

    }
}
