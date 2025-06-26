package Arrays;

public class binarysearch {
    public static void binary_search(int[] arr,int key) {
        int start , end ,mid;
        start=0;
        end=arr.length-1;
        mid=(start+end)/2;
        
        while (start<=end) {
            if (arr[mid]==key) {
                System.out.println("Key found at mid index: "+mid);
                break;
            }
            else if(arr[mid]<key) {
                start=mid+1;
                for(int i=start;i<=end;i++) {
                    if (arr[i]==key) {
                        System.out.println("key found at index: "+i);
                    }
                }
                break;
            }
            else {
                end=mid-1;
                for(int i=0;i<=end;i++) {
                    if (arr[i]==key) {
                        System.out.println("key found at index: "+i);
                    }
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        binary_search(arr, 5);
    }
}
