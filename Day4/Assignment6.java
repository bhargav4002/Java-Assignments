import java.util.Scanner;
class Assignment6{
    public static void printTable (int n){
        for (int i=1; i<=10; i++){
            System.out.Print(n*i + " ");
        }
        return ;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
}

// import java.util.Scanner;
// class Assignment6{ 
//     public static void main(String[] args){
//         System.out.println("Enter a number:");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for (int i = 1; i <= 10; i++){
//             System.out.println( (num * i));
//         }
//         sc.close();
//     }
// }

