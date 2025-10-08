public class mergeSort {

    private static int k =0, ass = 0, comp = 0;;

    public static void mergeSort(int[] A) {

        int n =  A.length;

        if (n < 2) {
            return;
        }
        comp++;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = A[i];
            ass++;
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = A[i];
            ass++;
        }
        mergeSort(left);
        mergeSort(right);

        merge(A, left, right, mid, n-mid);

        System.out.println(k +":");
        Main.print(left);
        Main.print(right);
        Main.print(A);
        System.out.println("\nAssignees: "+ass+" Comparisons: "+comp);
        System.out.println("\n");
        k++;
    }

    public static void merge(int[] A, int[] left, int[] right, int l, int r) {
        int i = 0, j = 0, k = 0;

        comp+=2;
        while (i < l && j < r) {

            comp++;
            if (left[i] <= right[j]) {

                A[k++] = left[i++];
                ass++;
            }
            else {
                A[k++] = right[j++];
                ass++;
            }
        }

        comp++;
        while (i < l) {
            A[k++] = left[i++];
            ass++;
        }

        comp++;
        while (j < r) {
            A[k++] = right[j++];
            ass++;
        }
    }
}
