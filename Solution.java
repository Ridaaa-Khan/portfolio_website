import java.util.Arrays;

public class Solution {
    // to revise all the searching and sorting algorithms

    public static void main(String[] args) {
        int[] arr = { 2, 6, 4, 5, 9, 8, 70 };
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int linear_search(int[] arr, int target) {// worked right
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binary_search(int[] arr, int target, int s, int e) {// worked right
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return (binary_search(arr, target, s, mid - 1));

        }

        return binary_search(arr, target, mid + 1, e);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static int getMaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxindex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static void insertion_sort(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            for(int j= i+1; j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }  
    }

    public static void merge_sort(int[] arr, int s, int m, int e){
        
    }
}