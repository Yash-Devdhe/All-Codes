public class LinearSearch {

    int linearSearch(int arr[], int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int arr[] = {10, 25, 30, 45, 60};
        int target = 45;

        LinearSearch l = new LinearSearch();

        System.out.println(l.linearSearch(arr, target));
    }
}