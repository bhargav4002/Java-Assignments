import java.util.Scanner;
class Assignment6{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Integer : ");
        int a = sc.nextInt();
        System.out.println("Enter Second  Integer : ");
        int b = sc.nextInt();
        System.out.println("Before Swap : a= " + a +"  b= " + b );
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After  Swap : a= " + a +"  b= " + b );
        sc.close();
    }
}