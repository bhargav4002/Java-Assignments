import java.util.Scanner;
class Assignment3{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter byte :");
        byte b = sc.nextByte();
        System.out.println("Enter short :");
        short s = sc.nextShort();
        System.out.println("Enter char :");
        char a = sc.next().charAt(0);
        System.out.println("Enter int :");
        int i = sc.nextInt();
        int sum = b+s+a+i;
        System.out.println("Expression:byte+short+char+int = " + sum + " (" + a + " = " + (int)a + ")");
        sc.close();
    }
}