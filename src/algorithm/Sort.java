package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        for (int i = 0; i < array.length; i++) {
            int j = i - 1;
            int pass = array[i];
            while (j >= 0 && array[j] > pass) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = pass;
//            System.out.println(array[i] + "INSERT");

        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
//            System.out.println(array[i] + "Bubble");
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


//    public int[] mergeSort(int[] array,int[] leftArray, int[] rightArray, int[] sortedArray){
//        final long startTime = System.currentTimeMillis();
//        int[] list = array;
//
//        int leftArrayLength = leftArray.length;
//        int rightArrayLength = rightArray.length;
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while(i < leftArrayLength && j < rightArrayLength) {
//            if(leftArray[i] < rightArray[j]) {
//                sortedArray[k] = leftArray[i];
//                i++;
//            } else {
//                sortedArray[k] = rightArray[j];
//                j++;
//            }
//            k++;
//        }
//        //copy the rest of the first half if there is anything left
//        while(i < leftArrayLength) {
//            sortedArray[k] = leftArray[i];
//            i++;
//            k++;
//        }
//        //copy the rest of the second half if there is anything left
//        while(j < rightArrayLength) {
//            sortedArray[k] = rightArray[j];
//            j++;
//            k++;
//        }
//        System.out.println(array);
//        final long endTime = System.currentTimeMillis();
//        final long executionTime = endTime - startTime;
//        this.executionTime = executionTime;
//        return list;
//    }





    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
