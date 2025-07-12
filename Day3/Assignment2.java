import java.util.Scanner;
class Assignment2{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Integer : ");
        int x = sc.nextInt();
        System.out.println("Enter Second  Integer : ");
        int y = sc.nextInt();
        System.out.println("Addition : " + (x+y));
        System.out.println("Subtraction : " + (x-y));
        System.out.println("Multiplication : " + (x*y));
        System.out.println("Division:   " + (x/y));
        System.out.println("Modulus : " + (x%y));
        System.out.println("Greater than:  " + (x>y));
        System.out.println("Less than:  " + (x<y));
        System.out.println("Equal to:  " + (x==y));
        System.out.println("Logical AND (x>5 && y<10):  " + (x>5 && y<10));
        System.out.println("Logical OR (x>5 && y<10):  " + (x>5 || y<10));
        System.out.println("Bitwise AND:  " + (x&y));
        System.out.println("Bitwise OR:   " + (x|y));
        System.out.println("Left Shift (x << 1):   " + (x<<1));
        System.out.println("Right Shift (x >> 1):   " + (x>>1));
        sc.close();
        
    }
}