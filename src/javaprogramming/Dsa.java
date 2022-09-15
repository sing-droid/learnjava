package javaprogramming;

import java.util.HashMap;
import java.util.Scanner;

//find the sum of occurances of two element in an array with repeated element gfg questin

public class Dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i<n; i++){
            int s = sc.nextInt();
            if(hash.containsKey(s)){
                int v = hash.get(s);
                hash.put(s,++v);
            }
            else {
                hash.put(s,1);
            }
        }
        if(hash.containsKey(x) && hash.containsKey(y)){
            int v1 = hash.get(x);
            int v2 = hash.get(y);
            System.out.println(v1+v2);

        }
        else {
            System.out.println("incorrect");
        }

    }
}
