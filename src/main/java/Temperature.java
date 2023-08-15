package main.java;

public class Temperature {
    /* private static final double[] values = {1}; */
    static final String[] units = {"Celcius", "Farenheit", "Kelvin"};

    public static double convertProcess(double value, int firstIndex, int secondIndex) {
        if (firstIndex == 0 && secondIndex == 1) {
            return (value * 9/5) + 32; // Celsius to Fahrenheit
        } else if (firstIndex == 0 && secondIndex == 2) {
            return value + 273.15; // Celsius to Kelvin
        } else if (firstIndex == 1 && secondIndex == 0) {
            return (value - 32) * 5/9; // Fahrenheit to Celsius
        } else if (firstIndex == 1 && secondIndex == 2) {
            return (value - 32) * 5/9 + 273.15; // Fahrenheit to Kelvin
        } else if (firstIndex == 2 && secondIndex == 0) {
            return value - 273.15; // Kelvin to Celsius
        } else if (firstIndex == 2 && secondIndex == 1) {
            return (value - 273.15) * 9/5 + 32; // Kelvin to Fahrenheit
        }
        return value;
    }
}