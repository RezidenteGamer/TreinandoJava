public class ConverterTemperatura {
    public static void main(String[] args) {
        double celsius = 25;

       System.out.println(celsius + "Celsius em Fahrenheit é: " + converterFh(celsius));
       System.out.println(celsius + "Celsius em Kelvin é: " + converterKv(celsius));
    }
    public static double converterFh(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static double converterKv(double celsius){
        return celsius + 273.15;
    }
}
