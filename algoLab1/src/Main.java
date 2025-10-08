import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {50, 80, 19, 86, 35, 7, 60, 48, 51};

        int[] arr2 = {50, 80, 19, 86, 35, 7, 60, 48, 51};

        selectionSort.sort(arr);
        print(arr);

        System.out.println("\n\n");

        insertSort.sort(arr2);
        print(arr2);
    }


    public static void print (int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


