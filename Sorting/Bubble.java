package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void bubblesort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            for (int j=0;i<n-1-i;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp =arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={7,2,98,33,46,22,86,14};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
