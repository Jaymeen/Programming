package searching;

public class BinarySearch {
        public boolean search(int[] arr, int x) {
                int left = 0, right = arr.length - 1;
                int mid = left + (right - left) / 2;
                
                while(left <= right) {
                        if(arr[mid] == x) {
                                return true;
                        }
                        else if(arr[mid] < x) {
                                left = mid + 1;
                        }
                        else {
                                right = mid - 1;
                        }
                        
                        mid = left + (right - left) / 2;
                }
                
                return false;
        }
        
        public int searchIndex(int[] arr, int x) {
                int left = 0, right = arr.length - 1;
                int mid = left + (right - left) / 2;
                
                while(left <= right) {
                        if(arr[mid] == x) {
                                return mid;
                        }
                        else if(arr[mid] < x) {
                                left = mid + 1;
                        }
                        else {
                                right = mid - 1;
                        }
                        
                        mid = left + (right - left) / 2;
                }
                
                return -1;
        }
        
        public int searchFirstIndex(int[] arr, int x) {
                int left = 0, right = arr.length - 1;
                int mid = left + (right - left) / 2;
                
                while(left <= right) {
                        if(arr[mid] == x) {
                                if(mid > 0 && arr[mid - 1] == x) {
                                        right = mid - 1;
                                }
                                else {
                                        return mid;                                        
                                }
                        }
                        else if(arr[mid] < x) {
                                left = mid + 1;
                        }
                        else {
                                right = mid - 1;
                        }
                        
                        mid = left + (right - left) / 2;
                }
                
                return -1;
        }
        
        public int searchLastIndex(int[] arr, int x) {
                int left = 0, right = arr.length - 1;
                int mid = left + (right - left) / 2;
                
                while(left <= right) {
                        if(arr[mid] == x) {
                                if(mid < arr.length - 1 && arr[mid + 1] == x) {
                                        left = mid + 1;
                                }
                                else {
                                        return mid;                                        
                                }
                        }
                        else if(arr[mid] < x) {
                                left = mid + 1;
                        }
                        else {
                                right = mid - 1;
                        }
                        
                        mid = left + (right - left) / 2;
                }
                
                return -1;
        }
}
