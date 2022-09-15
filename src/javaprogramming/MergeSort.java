package javaprogramming;

import java.util.Scanner;

public class MergeSort {
    public static int count = 0;
    public static void mergeArrays(int[] array, int left, int mid, int right){
        //We have to merge two arrays left...mid and mid+1...right
        int[] newArray = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right){//1 2
            if(array[i] <= array[j]){//6
                newArray[k] = array[i];//k=1 2 3 4 5
                i++;
            }
            else{
                newArray[k] = array[j];
                j++;
            }
            k++;
        }

        //copy values
        while(i <= mid){
            newArray[k] = array[i];
            i++;
            k++;
        }

        while(j <= right){
            newArray[k] = array[j];
            j++;
            k++;
        }

        //newArray is completely sorted ... from left..right
        for(i = left, k = 0 ; i <= right; i++, k++){
            array[i] = newArray[k]; //0....right-left+1
        }

    }
    public static void implementMergeSort(int[] array, int left, int right){
        if(left >= right){
            return;
        }

        int mid = (left + right) / 2;
        implementMergeSort(array, left, mid); //sort from left...mid
        implementMergeSort(array, mid + 1, right); //sort from mid+1....right

        //We have to merge two arrays left...mid and mid+1...right
        mergeArrays(array, left, mid, right);
        count++;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        implementMergeSort(array, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("\n"+count);
    }
}

