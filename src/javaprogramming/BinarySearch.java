package javaprogramming;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr [],int x,int left,int right){
        if(left>=right){
            return -1;
        }
        int mid =(left+right)/2;
        if(x==arr[mid]){
            return mid;

        }
        else if(x>arr[mid]){
            return binarySearch(arr,x,mid+1,right);

        }
        else{
            return binarySearch(arr,x,left,mid-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(binarySearch(arr,x, 0,n-1 ));
    }
}
