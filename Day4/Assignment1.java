import java.util.Scanner;

class Assignment1{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value  ");
        int x= sc.nextInt();
        System.out.println("Original : " + x);
        System.out.println("Binary :"+ Integer.toBinaryString(x) );
        System.out.println("~" +x+"="+~x); 
        System.out.println("Binary of ~" + x + ": " + Integer.toBinaryString(~x));
        sc.close();
    }
    
}
