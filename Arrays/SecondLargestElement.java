public class SecondLargestElement{
    public static void main(String[] args) {
        int arr[] = {54,78,12,45,78};
        SecondLargestElement a = new SecondLargestElement();
        System.out.println(a.SecLarge(arr));
    }
    int SecLarge(int arr[]) {
    int sec = Integer.MIN_VALUE;
    int maxi = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > maxi) {
            sec = maxi;
            maxi = arr[i];
        } 
        else if (arr[i] > sec && arr[i] < maxi) {
            sec = arr[i];
        }
    }

    return sec;
}
}