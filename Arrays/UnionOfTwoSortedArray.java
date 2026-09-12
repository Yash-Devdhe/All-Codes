public class UnionOfTwoSortedArray {

    int[] Union(int arr1[], int arr2[]) {

        int res[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                k++;
                i++;
            }

            else if (arr1[i] > arr2[j]) {
                res[k] = arr2[j];
                k++;
                j++;
            }

            else {
                res[k] = arr1[i];
                k++;
                i++;
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < arr1.length) {
            res[k] = arr1[i];
            k++;
            i++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {
            res[k] = arr2[j];
            k++;
            j++;
        }

        return res;
    }

    public static void main(String args[]) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 5, 6, 7};

        UnionOfTwoSortedArray u = new UnionOfTwoSortedArray();

        int res[] = u.Union(arr1, arr2);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}