package javaprogramming;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
       // add();
        display();
       // int sum = twon();
        //System.out.println(sum + " ");
    }

    public static void add() {
        int a = 12;
        int b = 13;
        int sum = a + b;
        System.out.println(sum + " ");
    }

    public static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter a number : ");
        int n = sc.nextInt();
        System.out.println(" enetr a second number : ");
        int m = sc.nextInt();
        int sub = m + n;
        System.out.println(" sum of two number is : "+sub);


    }

    public static int twon() {
        int a = 12;
        int b = 14;
        int sum = a + b;
        return sum;
    }
}
