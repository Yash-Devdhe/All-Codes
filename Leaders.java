
import java.util.*;

class Solution {
    public List<Integer> leaders(int[] nums) {
        int high = nums[nums.length-1];
        int sec = 0;
        int third = 0;
        ArrayList<Integer> a = new ArrayList<Integer>(3);
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]>high){
                third = sec;
                sec = high;
                high = nums[i];
            }
        }
        a.add(high);
        a.add(sec);
        a.add(third);
        return a;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {16, 17, 4, 3, 5, 2};

        List<Integer> result = obj.leaders(nums);

        System.out.println(result);
    }
}
