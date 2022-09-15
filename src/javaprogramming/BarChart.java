package javaprogramming;

public class BarChart {
    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 1, 3};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i] >= floor) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
