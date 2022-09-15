package javaprogramming;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int i = 0;// 1 2 3 4 5 6
        int j = n-1;
        int sum = 0;
        for(int m = 0; i<n; m++){
            for(int p = m+1; p<n-1; p++){
                if((arr[m] + arr[p]) == sum){
                    System.out.println(sum);
                }
            }
        }


        }
    }

