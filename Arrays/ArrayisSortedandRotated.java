public class ArrayisSortedandRotated {
    boolean rotedSorted(int arr[]) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
            }
        }
        if (count != 0) {
            if (arr[arr.length - 1] > arr[0]) {
                count++;
            }
        }
        if (count == 0 || count == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        ArrayisSortedandRotated s = new ArrayisSortedandRotated();
        System.out.println(s.rotedSorted(arr));
    }
}
