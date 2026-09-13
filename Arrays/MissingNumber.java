class MissingNumber { 
    public int missingNumber(int[] nums) { 
        for(int i=1; i<nums.length; i++){ 
             if(nums[i]!=nums[i-1]+1){ 
                return nums[i]-1; 
             } 
        } 
        return nums[nums.length-1]+1; 
    }

    public static void main(String[] args) {

        int nums[] = {0, 1, 2, 4, 5};
        MissingNumber s = new MissingNumber();
        System.out.println(s.missingNumber(nums));
    }
}