import java.util.Scanner;

class Assignment4{
    public static void changedValue (int x){
        x=100;
    System.out.println("Value inside function: " + x);    
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        System.out.println("Value before function call: " + x);
        changedValue(x);
        System.out.println("Value after function call: " + x);
    }
}