import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args){

        int[] n = {11,9,7,100,22};
        System.out.println(findMin(n));
        br();

        int[] arr= readInteger();
        System.out.println(findMin(arr));
        System.out.println(Arrays.toString(arr));
        br();

        int[] m = readInteger(11,10,12,9,13);
        System.out.println(findMin(m));
        br();

    }

    public static void br(){
        System.out.println("-".repeat(25));
    }

    public static int[] readInteger(int... abc){
        int[] arr;
        if(abc.length >0){
            arr = abc;
        }else {
            Scanner sc = new Scanner(System.in);
            System.out.println("length of array: ");
            int len = sc.nextInt();

            arr = new int[len];
            for (int i = 0; i < len; i++) {
                System.out.println("Enter an int at index " + i + " : ");
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));

        return arr;
    }

    public static int findMin(int[] arr){
//        Arrays.sort(arr);
//        System.out.print("Min element in arr: ");
//        return arr[0];

        int min = arr[0];
        for(int el : arr){
            if(el < min){
                min = el;
            }
        }
        return min;
    }
}
