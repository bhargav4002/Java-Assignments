import java.util.Scanner;
import java.util.ArrayList;
class Assignment4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = sc.nextInt();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        ArrayList<Integer> greaterNumber = new ArrayList<>();
        System.out.print("Enter the elements of the array:");
        for( int i = 0 ; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int e:arr){
            if(e>x){
                greaterNumber.add(e);
            }
        }
        System.out.print("elements greater than "+ x +" =" +greaterNumber );
        sc.close(); 
    }
}

