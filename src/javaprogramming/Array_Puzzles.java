package javaprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (
                int i = 0;
                i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 0;
        int arr1[] = new int[n];
        for (
                int i = 0;
                i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    continue;
                } else {
                    product = product * arr[j];
                }

            }
            arr1[k] = product;
            k++;
        }
        System.out.println(Arrays.toString(arr1));

    }
}
