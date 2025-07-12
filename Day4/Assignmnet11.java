import java.util.Scanner;
class Assignment11{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Weight:");
        float w = sc.nextFloat();
        System.out.println("Height:");
        float h = sc.nextFloat();
        float bMI = w/(h*h);
        System.out.println("BMI = " + bMI);
        sc.close();
    }
        
}
