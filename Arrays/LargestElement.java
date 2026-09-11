public class LargestElement{
    public static void main(String[] args) {
        int arr[] = {3,4,7,8,5,2};
        LargestElement l = new LargestElement();
        System.out.println(l.large(arr));
    }
    int maxi =0;
    int large(int arr[]){
        for(int i=0; i<arr.length; i++){
            maxi = Math.max(arr[i],maxi);
        }
        return maxi;
    }
}