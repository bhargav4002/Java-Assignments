import java.util.Arrays;


class Assignment5{

    public static void modifyArray(int[] arr) {
        arr[0] = 99;
        System.out.println("Value inside function: " + Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr ={1,2,3};
        System.out.println("Before function call:"+Arrays.toString(arr));
        modifyArray(arr);
        System.out.println("After function call:"+Arrays.toString(arr));
    }
}