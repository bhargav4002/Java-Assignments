import java.util.Scanner;
class Assignment4{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Integer :");
        int a = sc.nextInt();
        System.out.print("Original: " + a +"\n");
        System.out.print("Pre-Increment: " + (++a) +"\n");
        System.out.print("Post-Increment: " + (a++) + " (printed) ,then becomes "+ a +"\n");
        System.out.print("Pre-Decrement: : " + (--a)+"\n" );
        System.out.print("Post-Decrement: : " + (a--)+ " (printed) ,then becomes "+ a +"\n");
        sc.close();
    }
}