public class pair {
    public static void pair(int[] arr) {
        // int start=0;
        int end =arr.length-1;
        for(int i=0;i<=arr.length-1;i++) {
            int curr =arr[i];
            for(int j=i+1;j<=end;j++) {
                System.out.print("( "+curr+" , "+arr[j]+" )");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        pair(arr);
    }
}