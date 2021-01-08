package sorting;

public class BubbleSort {
        public void sortAscending(int[] arr) {
                int n = arr.length, temp;
                boolean swap;
                
                for(int i = 0; i < n; i++) {
                        swap = false;
                        for(int j = 0; j < n - 1 - i; j++) {
                                if(arr[j] > arr[j + 1]) {
                                        temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = temp;
                                        
                                        swap = true;
                                }
                        }
                        
                        if(!swap) {
                                break;
                        }
                }
        }
        
        public void sortDescending(int[] arr) {
                int n = arr.length, temp;
                boolean swap;
                
                for(int i = 0; i < n; i++) {
                        swap = false;
                        for(int j = 0; j < n - 1 - i; j++) {
                                if(arr[j] < arr[j + 1]) {
                                        temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = temp;
                                        
                                        swap = true;
                                }
                        }
                        
                        if(!swap) {
                                break;
                        }
                }
        }
}
