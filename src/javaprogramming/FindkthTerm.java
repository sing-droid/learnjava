package javaprogramming;

import java.util.Scanner;

public class FindkthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int maxindex = 0;
        for(int i=0; i<n; i++){
            if(arr[i]> max){
                max= arr[i];
                maxindex = i;
            }
        }
        for(int i=0; i<n; i++){
            if(maxindex==i){
                continue;
            }
            else if((arr[i]*2) > max){
                System.out.println(-1);
                return;


            }
        }
        System.out.println(maxindex);
    }
}
