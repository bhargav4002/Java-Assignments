import java.util.Scanner;
class Assignment8{
    public static int div (int[]arr){
        int count = 0;
        for (int num : arr){
            if (num%3 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size = sc.nextInt();
        int[]arr = new int[size];
        System.out.print("Enter elements in the array: ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result = div(arr);
        System.out.print("Count of numbers divisible by 3 : " + result);
        sc.close();
    }
}