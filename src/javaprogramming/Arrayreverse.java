package javaprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayreverse {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i =0;
        int j= n-1;
        while(i<j){
            int temp =  arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
