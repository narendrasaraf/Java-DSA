public class check_if_sorted_rotated {
    public static boolean check(int [] arr) {
        int count=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<arr[i-1]) {
                count++;

                
                
            }
        }
        if(arr[0]<arr[arr.length-1]) {
            count++;
        }
        return count<=1;
    }
    public static void main(String[] args) {
        int [] arr={3,4,5,1,2};
        if(check(arr)) {
            System.out.println("The array is sorted and rotated.");
        } else {
            System.out.println("The array is not sorted and rotated.");
        }
    }
}
