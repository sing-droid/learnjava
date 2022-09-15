package javaprogramming;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int  i =0; i<n; i++){
            hash.put(arr[i],1);
        }
        System.out.println(hash.keySet());

    }
}
