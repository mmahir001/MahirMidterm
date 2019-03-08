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



    void merge(int array[], int left, int middle, int right)
    {
        int val1 = middle - left + 1;
        int val2 = right - middle;

        int x[] = new int [val1];
        int y[] = new int [val2];


        for (int i=0; i < val1; ++i)
            x[i] = array[left + i];
        for (int j=0; j < val2; ++j)
            y[j] = array[middle + 1+ j];

        int i = 0, j = 0;

        int k = left;
        while (i < val1 && j < val2)
        {
            if (x[i] <= y[j])
            {
                array[k] = x[i];
                i++;
            }
            else
            {
                array[k] = y[j];
                j++;
            }
            k++;
        }
        while (i < val1)
        {
            array[k] = x[i];
            i++;
            k++;
        }
        while (j < val2)
        {
            array[k] = y[j];
            j++;
            k++;
        }
    }

    public int[] mergeSort(int[] array, int left, int right){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        if (left < right)
        {
            int val = (left + right)/2;
            mergeSort(array, left, val);
            mergeSort(array ,val+1, right);
            merge(array, left, val, right);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int [] quickSort(int [] array, int left, int right){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int pIndex = left + (right - left) / 2;
        int pValue = array[pIndex];

        int i = left, j = right;

        while(i <= j) {

            while(array[i] < pValue) {
                i++;
            }

            while(array[j] > pValue) {
                j--;
            }

            if(i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }

            if(left < i) {
                quickSort(array, left, j);
            }

            if(right > i) {
                quickSort(array, i, right);
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    void heap(int array[], int n, int i)
    {
        int val = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && array[left] > array[val])
            val = left;

        if (right < n && array[right] > array[val])
            val = right;

        if (val != i)
        {
            int trade = array[i];
            array[i] = array[val];
            array[val] = trade;
            heap(array, n, val);
        }
    }

    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heap(array, n, i);
        for (int i=n-1; i>=0; i--)
        {
            int val = array[0];
            array[0] = array[i];
            array[i] = val;
            heap(array, i, 0);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
