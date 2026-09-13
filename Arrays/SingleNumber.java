class SingleNumber { 
    public int singleNumber(int[] nums) { 
 
        int ans = 0; 
 
        for(int num : nums) { 
            ans = ans ^ num; 
        } 
 
        return ans; 
    } 
    // public int singleNumber(int[] nums) {
    //     int single = 0;
    //     if(nums.length == 1){
    //         return nums[0];
    //     }
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i]!=nums[j]){
    //                 return nums[i];
    //             }

    //         }
    //     }
    //     return 0;
    // }

    public static void main(String[] args) {

        int nums[] = {4, 1, 2, 1, 2};
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(nums));
    }
}