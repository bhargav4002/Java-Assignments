import java.util.Scanner; 

class Assignment2{

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer : " );
        int x = scanner.nextInt();
        System.out.println("Enter Float : " );
        float y = scanner.nextFloat();
        System.out.println("Enter String: ");
        String str = scanner.next();
        scanner.close();
        float a  = (float) x;
        int b = (int) y;
        int c = Integer.parseInt(str);
        System.out.println("Int to Float " + a);
        System.out.println("Float to Int " + b);
        System.out.println("String to Int " + c);
    }
}