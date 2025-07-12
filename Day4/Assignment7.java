import java.util.Scanner;
class Assignment7{
    public static int getSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        sc.close();
        return (num*num);   
    }
    public static void main(String[]args){
        int square = getSquare();
        System.out.println("Returned square: " + square);
    }
}
