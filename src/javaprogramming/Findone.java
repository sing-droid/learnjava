package javaprogramming;

public class Findone {
    public static int findOne(int[] arr, int x, int left, int right) {
        if (left >= right) {
            return -1;
        }
        int mid = (left + right) /2;
        if ( arr[mid] == 0 || x > arr[mid - 1] && arr[mid] == x){
            return mid;

        }
        else if(x > mid){
            return findOne(arr, mid+1, right,x);
        }
        else{
            return findOne(arr,left, mid-1, x);
        }
    }

    public static void main(String[] args) {
        int arr []  = {0,0,0,0,1,1,1};
        System.out.println(findOne(arr,0,arr.length-1,1));
    }
}
