package day01_06_30_2022;

public class TemperatureConverter {
    public static void main(String[] args) {

        int fahrenheit = 212;
        double celsius = (5 * (fahrenheit-32))/9;
        System.out.println(celsius);

        System.out.println(fahrenheit + " fahrenheit is equal to " + celsius + " celcius");

    }
}
