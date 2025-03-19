import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = randomArray(6);
        System.out.println(Arrays.toString(arr));

        System.out.println();

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        decreasingOrder(copyArr);

        System.out.println();

        int[] thirdArr = randomArray(9);
        reverseOrder(thirdArr);

        System.out.println();

        int[] desSort = Arrays.copyOf(arr, arr.length);
//        int[] desSort = {2,5,1,10};
        desSortArray(desSort);

    }
    //by lecture - it will also sort it without sort method
    public static void desSortArray(int[] arr){
        System.out.println(Arrays.toString(arr));
        int temp;
        boolean flag = true;

        while(flag) {
            flag = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                    System.out.println("------ " + Arrays.toString(arr));
                }
            }
            System.out.println(">>> " + Arrays.toString(arr));
        }
    }

    //by gpt - has sort()
    public static void reverseOrder(int[] arr){
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[ arr.length-1 -i];
            arr[arr.length -1 -i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // created by me , include sort() and creates new local array
    public static void decreasingOrder(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] newArr = new int[arr.length];
        for(int i=0, j=arr.length-1 ; i<arr.length && j>=0; i++, j--){
            newArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] randomArray(int len){
        Random random = new Random();
        int[] newArray = new int[len];
        for(int i=0; i<len; i++){
            newArray[i] = random.nextInt(101);
        }
        return newArray;
    }
}