package javaprogramming;

//2. Find an largest element < = k in given sorted array

public class SandeepReddyMock {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 20, 25, 33, 45};
        int key = 11;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
            } else if (arr[i] < key) {
                index = i;

            }
            else{
                break;
            }

        }
        System.out.println(arr[index]);

    }


}
