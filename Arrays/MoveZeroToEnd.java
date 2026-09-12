public class MoveZeroToEnd {
    int[] Move(int arr[]) {
        int k = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            } else {
                count++;
            }
        }
        while (count >= 0 && k < arr.length) {
            arr[k] = 0;
            count--;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 0,0, 45, 56, 7, 78,0};
        MoveZeroToEnd m = new MoveZeroToEnd();
        int result[] = m.Move(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
