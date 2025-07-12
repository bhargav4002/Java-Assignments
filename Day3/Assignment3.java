import java.util.Scanner;
class Assignment3{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Number");
        int x = sc.nextInt();
        String y = ((x%2==0) ? "The number " + x + " is Even" : "The number " + x + " is Odd");
        System.out.println(y);
        sc.close();
    }
}