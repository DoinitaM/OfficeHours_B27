package day04_07_20_2022;

public class T4_MainCategory {
    public static void main(String[] args) {
        /*
        Assume that you searched a baby toy in Etsy.When you open related category your url is :
			    			"https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
			    									(main category)
						 According to this result print out main category name

						 Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049
						 Output:
						 			Main Category name is  toys and games

						 Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
						 								     (main category)
						 Output:
						 			Main Category name is  toys and entertainment
         */

        String str = "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";
        int indexOfcSlash = str.indexOf("c/");
        String lastPart = str.substring(indexOfcSlash + 2);
        System.out.println("last part: " + lastPart);
        int indexOfSlash = lastPart.indexOf("/"); // or  int indexOfSlashT = str..indexOf("/t");
       String mainCategory = lastPart.substring(0, indexOfSlash) ;
        System.out.println("Main category: " + mainCategory);
        String result = mainCategory.replace("-", " ");
        System.out.println(result);
    }
}
