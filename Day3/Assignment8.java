import java.util.Scanner;
class Assignment8{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println( "length = " );
        int l = sc.nextInt();
        System.out.println( "breadth = " );
        int b = sc.nextInt();
        System.out.println("Area: " + (l*b));
        System.out.println("Perimeter: " + (2*(l+b)));
        sc.close();
        
    }
}