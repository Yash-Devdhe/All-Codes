import java.util.*;
class Solution { 
    public int mostFrequentElement(int[] nums) { 
        int maxVal=0;
        Map<Integer,Integer> m = new HashMap<>(); 
        int maxk = 0;
        for(int num:nums){ 
            m.put(num,m.getOrDefault(num,0)+1); 
        } 
        for(Map.Entry<Integer,Integer> i:m.entrySet()){ 
            maxVal = Math.max(maxVal,i.getValue()); 
            if(i.getValue() == maxVal){
                maxk = i.getKey();
            }
        } 
        return maxk; 
      
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 2, 3, 1, 2, 1, 1};

        int result = obj.mostFrequentElement(nums);

        System.out.println(result);
    }
}