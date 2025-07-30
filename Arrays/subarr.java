

public class subarr {
    public static void subarray(int[] arr) {
        for(int i=0;i<=arr.length-1;i++) {
            int curr=arr[i];
            // Print all subarrays starting with arr[i]
            for(int j=i;j<=arr.length-1;j++) {
                // Print subarray from i to j
                System.out.print("( ");
                for(int k=i;k<=j;k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.print(")");
                System.out.println();
            }
            // for(int j=i+1;j<=arr.length-1;j++) {
            // }
        }
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        subarray(arr);
    }
}
