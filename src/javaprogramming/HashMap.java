package javaprogramming;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

class Hash {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i]  = sc.nextInt();
        }
        for(int i=0; i<10; i++){
            if(hash.containsKey(arr[i])){
                int v = hash.get (arr[i]);
                hash.put(arr[i],++v);
            }
            else{
                hash.put (arr[i],1);
            }
        }
        System.out.println(hash);
        System.out.println(hash.get(1));
        //System.out.println(hash.containsKey(2));
       for(Map.Entry<Integer, Integer> var : hash.entrySet()){
           if(var.getValue() != 1){
               System.out.println(var.getKey());
           }

       }
    }


}
class Set{
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            hash.add(arr[i]);
        }

        System.out.println(hash);

        HashSet<Integer> duplicate = new HashSet<Integer>();
        duplicate.addAll(hash);
        System.out.println(duplicate);

    }
}

