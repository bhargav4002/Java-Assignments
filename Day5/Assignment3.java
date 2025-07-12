import java.util.Scanner;
class Assignment3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int largest = arr[0];
        System.out.println("Enter the elements of the array:");
        for( int i =0 ; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
            System.out.print( "maximum element:"+ largest);
            String num = ((largest%2==0) ? "It is a even number" : "It is a odd number");
            System.out.print("\n" + num);
            sc.close();
    }
}