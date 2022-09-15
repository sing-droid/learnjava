package javaprogramming;
//Linear & Binary search
//        Program to find product of the digits
//        time complexity of basic sorting techniques
//        Bubble and Selection Sort
//        Hashing - Hashmaps & hashsets
//        Program to print the unique elements and distinct elements of an
//        array

import java.util.HashMap;
import java.util.Map;

public class PawanBansaliMock {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 2, 5, 2, 5};
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                int v = hash.get(arr[i]);
                hash.put(arr[i], ++v);
            } else {
                hash.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> map : hash.entrySet()) {
            if (map.getValue() == 1) {
                System.out.println(map.getKey());
            }
        }
        for (Map.Entry<Integer, Integer> map : hash.entrySet()) {
            System.out.print(map.getKey());
        }
    }
}

