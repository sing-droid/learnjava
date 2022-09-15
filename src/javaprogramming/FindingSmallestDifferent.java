package javaprogramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FindingSmallestDifferent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test--> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> newarr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    newarr.add(Math.abs(arr[i]-arr[j]));
                }
            }
            Collections.sort(newarr);
            System.out.println(newarr.get(k-1));



        }
    }
}

