package exercise4.aplication.util;

public class CurrentyConverter {
    public static double dollar;
    public static double dollarQuant;
    public static final double TAX = 1.06;

    public static double converter(){
        return dollar * dollarQuant * TAX;
    }
}
