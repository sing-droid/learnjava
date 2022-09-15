package javaprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class arr_practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int value = sc.nextInt();
        int[] arr = new int[6];
        for (int i = 0; i <= 5; i++) {
            if (i == index) {
                arr[i] = value;
            } else {
                arr[i] = sc.nextInt();
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
