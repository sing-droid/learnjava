package javaprogramming;

import java.util.Scanner;

public class Binary {
    public static int binarysearch(int [] arr, int x, int left, int right){
        if(left >= right){
            return -1;
        }
        int mid = (left + right)/2;
        if(x == arr[mid]){
            return mid;
        }
        else if (x > arr[mid]) {
            return binarysearch(arr, x, mid+1, right);

        }
        else{
            return binarysearch(arr, x, left, mid-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(binarysearch(arr, x, 0, n-1));
    }
}
