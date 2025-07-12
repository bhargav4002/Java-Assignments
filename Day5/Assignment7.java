import java.util.Scanner;
class Assignment7{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num;
        int sum=0;
        do{
            System.out.print("Enter a number :");
            num = sc.nextInt();
            sum+=num;
        }while(num!=0);
        System.out.print("Sum= "+sum);
        sc.close();
        
    }
}