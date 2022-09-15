package javaprogramming;

import java.util.Scanner;

public class Palindrom_number {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = 0;
        int j = n - 1;
        while (m < j) {
            if (arr[m] != arr[j]) {
                System.out.println("not palindrom");
                return;
            }
            m++;
            j--;

        }
        System.out.println("it is a palindrom");

    }
}
