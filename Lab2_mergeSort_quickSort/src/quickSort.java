public class quickSort {

    private static int ass=0, comp=0;

    public static void quickSort(int[] arr, int low, int high){

        comp++;
        if(low<high){
            Main.print(arr);
            System.out.print("\nAssignees:"+ass+" Comparisons:"+comp);
            int pivotIndex = partition(arr, low, high);
            ass++;
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int left = low +1;
        int right = high;
        ass+=3;


        while(true){
            comp+=2;
            while(left <= right && arr[left] <= pivot){
                left++;
            }
            comp+=2;
            while(right >= left && arr[right] >= pivot){
                right--;
            }
            comp++;
            if(right < left){break;}
            else{
                int tmp =  arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                ass+=3;
            }
        }
        int tmp = arr[low];
        arr[low] = arr[right];
        arr[right] = tmp;
        ass+=3;

        return right;
    }
}
