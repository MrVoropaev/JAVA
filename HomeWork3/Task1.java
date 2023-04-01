/*Реализовать алгоритм сортировки слиянием и выборкой. */




// Алгоритм сортировки слиянием

package HomeWork3;

public class Task1 {
    
    public void mergeSort(int[] array, int l, int r) {

        if (l < r) {
            int middle = (l + r) / 2;
            mergeSort(array, l, middle);
            mergeSort(array, middle+1, r);
            merge(array, l, middle, r);
        }
    }
    
    public void merge(int[] array, int l, int middle, int r) {
        int[] tempArray = new int[array.length];
        for (int i = l; i <= r; i++) {
            tempArray[i] = array[i];
        }
        int i = l;
        int j = middle+1;
        int k = l;
        while (i <= middle && j <= r) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
    
}


// Алгоритм сортировки выборкой

/*public void selectionSort(int[] array) {
    for (int i = 0; i < array.length-1; i++) {
        int minIndex = i;
        for (int j = i+1; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
    }
}
 */

