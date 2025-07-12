import java.util.Scanner;
class Assignment10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        for (int i=1;i<=10;i++){
            if(i==x){
                System.out.print("loop stopped at "  +x);
                break;
            }
            System.out.print(i + " ");
        }
        
    }
}

// import java.util.Scanner;
// class Assignment10{
//     public static void main (String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number :");
//         int a = sc.nextInt();
//         switch (a) {
//             case 1:
//                 System.out.print("1 Loop stopped at " + a );
//                 break;
//             case 2:
//                 System.out.print("1 2 Loop stopped at " + a );
//                 break;
//             case 3:
//                 System.out.print("1 2 3 Loop stopped at " + a );
//                 break;
//             case 4:
//                 System.out.print("1 2 3 4 Loop stopped at " + a );
//                 break;
//             case 5:
//                 System.out.print("1 2 3 4 5 Loop stopped at " + a );
//                 break;
//             case 6:
//                 System.out.print("1 2 3 4 5 6 Loop stopped at " + a );
//                 break;
//             case 7:
//                 System.out.print("1 2 3 4 5 6 7 Loop stopped at " + a );
//                 break;
//             case 8:
//                 System.out.print("1 2 3 4 5 6 7 8 Loop stopped at " + a );
//                 break;  
//             case 9:
//                 System.out.print("1 2 3 4 5 6 7 8 9 Loop stopped at " + a );
//                 break; 
//              case 10:
//                 System.out.print("1 2 3 4 5 6 7 8 9 10 Loop stopped at " + a );
//                 break;  
//             default:
//                 System.out.print("number is out of loop" );
//         }
//         sc.close();
//     }
        
// }
