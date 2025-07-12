import java.util.Scanner;
class Assignment4{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter float value :");
        float f = sc.nextFloat();
        System.out.println("To int: " +(int) f);
        System.out.println("To byte: " +(byte) f);
        sc.close();
    }
}
