package day04_07_20_2022;

public class T7_CamelCase {
    public static void main(String[] args) {
        /*       Camel Case
							Given a String of words that follow Camel Case convention.
							Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

					    Task 1  : Find and print how many words are in the given String.

								        Input: thisHasManyWordsToFind
								        Output: 6

					    Task 2  : Find and print each words are in the given String.

								        Input: thisHasManyWordsToFind
								        Output: This
								        		Has
								        		Many
								        		Words
								        		To
								        		Find
         */
        String str = "thisHasManyWordsToFind";
        int count = 0;

        for(int i=0;  i< str.length()-1; i++){

            char first = str.charAt(i);
            char second = str.charAt(i + 1);

            if((first>='a' && first <='z') &&(second>='A' && second<= 'Z')){
                count++;
            }


        }


        System.out.println("count; "+ count);





    }
}
