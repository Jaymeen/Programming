package searching;

public class LinearSearch {
        public boolean search(int[] arr, int x) {
                int n = arr.length;
                
                for(int i = 0; i < n; i++) {
                        if(arr[i] == x) {
                                return true;
                        }
                }
                
                return false;
        }
        
        public int searchFirstIndex(int[] arr, int x) {
                int n = arr.length;
                
                for(int i = 0; i < n; i++) {
                        if(arr[i] == x) {
                                return i;
                        }
                }
                
                return -1;
        }
        
        public int searchLastIndex(int[] arr, int x) {
                int n = arr.length;
                
                for(int i = n - 1; i >= 0; i--) {
                        if(arr[i] == x) {
                                return i;
                        }
                }
                
                return -1;
        }
        
        public boolean search2(int[] arr, int x) {
                int n = arr.length;
                
                int left, right;
                
                for(left = 0, right = n - 1; left <= right; left++, right--) {
                        if(arr[left] == x || arr[right] == x) {
                                return true;
                        }
                }
                
                return false;
        }
}
