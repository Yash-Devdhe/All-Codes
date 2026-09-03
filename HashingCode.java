import java.util.*;

class Solution { 
    public List<List<Integer>> countFrequencies(int[] nums) { 
        Map<Integer,Integer> m = new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> i:m.entrySet()){
            List<Integer> l = new ArrayList<>();
            l.add(i.getKey());
            l.add(i.getValue());
            res.add(l);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 2, 3, 1, 1};

        List<List<Integer>> result = obj.countFrequencies(nums);

        System.out.println(result);
    }
}