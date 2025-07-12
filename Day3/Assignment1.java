import java.util.Scanner;

class Assignment1{
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        byte byteValue = scanner.nextByte();
        short shortValue = scanner.nextShort();
        int intValue = scanner.nextInt();
        long longValue = scanner.nextLong();
        float floatValue = scanner.nextFloat();
        double doubleValue = scanner.nextDouble();
        System.out.println("Byte: " + byteValue + "  Range : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short: " + shortValue + "  Range : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int: " + intValue + "  Range : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: " + longValue + "  Range : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float: " + floatValue + "  Range : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double: " + doubleValue + "  Range : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        scanner.close();
    }
}
    