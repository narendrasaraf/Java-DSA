
public class reversearr {
    public static void reverse(int [] arr) {
        int start=0;
        int end =arr.length-1;
        while(start<=end) {
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print("Reversed array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,3,5,7,9,11,13,15,17,19};
        System.out.print("Original array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);
    }
}
