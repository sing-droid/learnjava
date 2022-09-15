public class Merge{
    public static void implement(int [] arr, int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)/2;
        implement(arr,left,mid );
        implement(arr,mid+1,right);
        merge(arr,left,mid,right);

    }
    public static void merge(int[] arr, left,mid,right){
        int [] newarr = new int [right-left+1];
        int i = left;
        int j = right;
        int k = 0;
        while (i<= mid && j<= right){
            if(arr[i] <= arr[j]){
                newarr[k] = arr[i];
                i++;
            }
            else{
                newarr[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            newarr[k] = arr[i];
            i++;
            k++;
        }
        while(j<= right){
            newarr[k] = arr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        implement(arr, 0,n-1);
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
