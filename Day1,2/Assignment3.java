import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        sc.close();
        greetUser(name);

    }
    public static void greetUser(String name) {
        System.out.println("Hello " + name + ", welcome to the MERN + DSA batch!");
    }
}
