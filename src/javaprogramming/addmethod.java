package javaprogramming;

import java.util.Scanner;

public class addmethod {
    public static void swap(int x, int y){
        int temp = x;
        x= y;
        y = temp;
        System.out.println(x+ " "+y);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        swap(n , m);




    }

}
