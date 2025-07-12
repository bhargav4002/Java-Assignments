import java.util.Scanner; 

class Assignment1{

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        float gpa = scanner.nextFloat();
        scanner.close();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + gpa);
    }
}