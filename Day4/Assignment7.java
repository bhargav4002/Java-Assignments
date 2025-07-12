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


// import java.util.Scanner;
// class Assignmnet7{
//     public static int getSquare(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int n = sc.nextInt();
//         int result = n*n;
//         return result;
//     }
        
//     public static void main(String[]args){
        
//         int s = getSquare();
//         System.out.println("Returned square:"+s );
//     }
// }
