package sorting;

public class SelectionSort {
        public void sortAscending(int[] arr) {
                int n = arr.length, min, temp;
                
                for(int i = 0; i < n - 1; i++) {
                        min = i;
                        for(int j = i + 1; j < n; j++) {
                                if(arr[min] > arr[j]) {
                                        min = j;
                                }
                        }
                        temp = arr[min];
                        arr[min] = arr[i];
                        arr[i] = temp;
                }
        }
        
        public void sortDescending(int[] arr) {
                int n = arr.length, max, temp;
                
                for(int i = 0; i < n - 1; i++) {
                        max = i;
                        for(int j = i + 1; j < n; j++) {
                                if(arr[max] < arr[j]) {
                                        max = j;
                                }
                        }
                        temp = arr[max];
                        arr[max] = arr[i];
                        arr[i] = temp;
                }
        }
}
