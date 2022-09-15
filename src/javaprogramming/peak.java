package javaprogramming;

import java.util.Arrays;

public class peak {
    public static void main(String[] args) {
        int arr [] = {1,2,7,3,8};
        int peak = 0;
        int index = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > peak){
                peak = arr[i];
                index = i;
            }
        }
        System.out.println(peak);
        System.out.println(index);
    }
}
