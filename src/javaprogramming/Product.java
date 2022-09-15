package javaprogramming;

public class Product {
    static int product(int n){
        int number = 1;
        while( n != 0){
            number = number * (n % 10);
            n = n/10;
        }
        return number;
    }
    public static void main(String[] args) {
        int n = 312;
        System.out.println(product(n));

    }
}
