package main.java;

public class Currency {
    /* | usd | eur | gbp | jpy | krw | try | mxn | */
    private static final double[] values = {17.5, 19, 21.75, 0.13, 0.0145, 0.65, 1};
    static final String[] currencies = {"USD", "EUR", "GBP", "JPY", "KRW", "TRY", "MXN"};

    public static double convertProcess(double value, int firstIndex, int secondIndex) {
        return (value * values[firstIndex])/values[secondIndex];
    }
}