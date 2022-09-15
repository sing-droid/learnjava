package javaprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_It {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        int k= 0;
        int count = 0;
        while(k<n){
            if(arr[j]==0){
                j++;
            }
            else if(arr[k]==0){
                int temp = arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                j++;
                count++;
            }
            k++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
