import java.util.Scanner;
class Assignment2{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Integer :");
        int x = sc.nextInt();
        System.out.println("Signed (" +x+">>2):" +(x>>2));
        System.out.println("UnSigned (" +x+">>>2):" +(x>>>2));
        sc.close();
        
    }
} 
    

