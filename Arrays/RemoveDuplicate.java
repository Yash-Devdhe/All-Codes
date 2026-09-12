public class RemoveDuplicate {
    int duplicate(int arr[]){
        int k =0;
        arr[k] = arr[0];
        k= 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]){
        int arr[] = {1,1,2};
        RemoveDuplicate r = new RemoveDuplicate();
        System.out.println(r.duplicate(arr));
    }
}
