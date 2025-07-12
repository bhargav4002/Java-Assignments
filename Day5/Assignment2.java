import java.util.Scanner;
import java.util.ArrayList;
class Assignment2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        ArrayList<Integer> odd = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        int i = 0;
        while ( i < size) {
            arr[i] = sc.nextInt();
            if (arr[i]%2 !=0){
                odd.add(arr[i]);
            }
            i++;
        }
        System.out.print( "Odd numbers:"+ odd);
        System.out.print( "Count"+ odd.size());
        sc.close();      
    }
}