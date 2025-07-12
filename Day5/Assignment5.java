
import java.util.Scanner;
import java.util.ArrayList;
class Assignment5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> positiveList = new ArrayList<>();
        System.out.print("enter the size of the array :");
        int size = sc.nextInt();
        int[]arr = new int[size];
        int avg=0;
        int sum=0;
        for (int i=0 ; i<size ; i++){
            System.out.print("Enter Element " + i + " in the array:");
            arr[i]=sc.nextInt();
            if(arr[i]>=0)
            {
                positiveList.add(arr[i]);
            }
        }
        for (int num:positiveList){
            sum+=num;
        }
        avg = sum/positiveList.size();
      System.out.print("Positive numbers " + positiveList.size() );
      System.out.print("Average of positive numbers : " + avg);
      sc.close();
    }
}

