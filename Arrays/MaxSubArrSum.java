
public class MaxSubArrSum {
    public static void MaxSum(int[] arr) {
        int Max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<=arr.length-1;i++) {
            for(int j=i;j<=arr.length-1;j++) {
                System.out.print("( ");
                for(int k=i;k<=j;k++) {
                    curr=curr+arr[k];
                    if (Max<curr) {
                        curr=Max;
                        System.out.println("Max: "+Max);
                    }
                }
                System.out.print(")");
                System.out.println();
            }
    }
}
public static void main(String[] args) {
    int [] arr={1,2,3,4,5};
    MaxSum(arr);
}
}
