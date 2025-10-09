public class selectionSort {

    public static void sort(int[] arr) {

        int ass = 0, comp = 0;

        for(int i = 0; i < arr.length-1; i++) {
            int min = i;
            ass +=1;

            for(int j = i + 1; j < (arr.length); j++) {

                comp++;
                if (arr[j]<arr[min]){
                    min = j;
                    ass+=1;
                }
            }

            comp+=1;
            if(min !=i) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
                ass+=3;
            }
            Main.print(arr);
            System.out.println("\nassignees:"+ass+" comparisons:"+comp);
        }
    }

}
