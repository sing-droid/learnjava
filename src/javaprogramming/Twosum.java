package javaprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Twosum {
    public static int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j]==target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }

        }
        return arr;


    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int [] arr1 = twoSum(arr,target);
            System.out.println(Arrays.toString(arr1));
        }
    }

