package main.java;

public class Distance {
    private static final double[] values = {1000, 1, 0.01, 1609.34, 0.914, 0.3048, 0.0254};
    static final String[] units = {"Kilometro", "Metro", "Centimetro", "Milla", "Yarda", "Pie", "Pulgada"};

    public static double convertProcess(double value, int firstIndex, int secondIndex) {
        return (value * values[firstIndex])/values[secondIndex];
    }
    
}
