import java.util.Scanner;
class Assignment6{ 
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println( (num * i));
        }
        sc.close();
    }
}
        

            


// import java.util.Scanner;
// class Assignment6{
//     public static void printTable (int n){
//         System.out.println(n*1);
//         System.out.println(n*2);
//         System.out.println(n*3);
//         System.out.println(n*4);
//         System.out.println(n*5);
//         System.out.println(n*6);
//         System.out.println(n*7);
//         System.out.println(n*8);
//         System.out.println(n*9);
//         System.out.println(n*10);
//         return ;
//     }
//     public static void main (String[]args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         printTable(n);
//         sc.close();
//     }
// }



