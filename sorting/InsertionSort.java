package sorting;

public class InsertionSort {
        public void sortAscending(int[] arr) {
                int n = arr.length, key, i, j;
                
                for(i = 1; i < n; i++) {
                        key = arr[i];
                        for(j = i - 1; j >= 0 && arr[j] > key; j--) {
                                arr[j + 1] = arr[j];
                        }
                        arr[j + 1] = key;
                }
        }
        
        public void sortDescending(int[] arr) {
                int n = arr.length, key, i, j;
                
                for(i = 1; i < n; i++) {
                        key = arr[i];
                        for(j = i - 1; j >= 0 && arr[j] < key; j--) {
                                arr[j + 1] = arr[j];
                        }
                        arr[j + 1] = key;
                }
        }
}
