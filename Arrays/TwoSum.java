import java.util.*;

public class TwoSum {
    // int[] twoSum(int arr[], int target) {
    //     for(int i = 0; i < arr.length; i++) {
    //         for(int j = i + 1; j < arr.length; j++) {
    //             if(arr[i] + arr[j] == target) {
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[]{-1, -1};
    // }
    int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if(map.containsKey(val)) {
                return new int[]{map.get(val), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }
    
    public static void main(String[] args) {

        int arr[] = {2, 7, 11, 15};
        int target = 9;

        TwoSum t = new TwoSum();

        int result[] = t.twoSum(arr, target);

        System.out.println(result[0] + " " + result[1]);
    }
}