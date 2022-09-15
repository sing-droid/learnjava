package javaprogramming;

import java.util.Scanner;

public class FindpeakValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int peak = arr[0];
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (peak < arr[i]) {
                peak = arr[i];
                max = i;
            }
        }
        System.out.println(peak);
        System.out.println(max);

    }
}
