public class Rotate {
    static void insert(int arr){
        for(int i  = 0; i<ar.length; i++){
            for(int j  = i+1; j<arr.lenght; i++){
                if(arr[j] <arr [j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,2,1,2,0};
        insert(arr);
        System.out.println(arr);
    }



}
