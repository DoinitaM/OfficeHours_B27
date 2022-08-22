package day01_06_30_2022;

public class TypeCasting {


    /*
    Type Casting:
    1. implicit casting
       * Done by compiler
       * Smaller to bigger
       * No loss data

     2. Explicit Casting
        * dome by developer
        * bigger to smaller
        * we can loss data but not always
     */
    public static void main(String[] args) {
        byte b = 20;
        short s = b;  // implicit
        byte b1 = (byte)s;
        int i = 45;
        short s2 = (short)i;
        long l = 11_111_111_111L;

        float f = 12.5F;





    }
}
