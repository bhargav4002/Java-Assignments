import java.util.Scanner;
class Assignment5{
    public static int max (int a,int b){
        int result=(a>b?a:b);
        return result;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
         int gN = max(a,b);
         System.out.println("Greater number is:" +gN );
         sc.close();
    }
}
