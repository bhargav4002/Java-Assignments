import java.util.Scanner;
import java.util.ArrayList;
class Assignment1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        int evenSum=0;
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            //  evenSum += (arr[i] % 2 == 0) ? arr[i] : 0;
            if (arr[i]%2 ==0){
                evenList.add(arr[i]);
                evenSum+=arr[i];
            }
        }
        System.out.print( "Even numbers:"+ evenList);
            System.out.print( "Sum of even elements :"+ evenSum);
        sc.close();
    }
}