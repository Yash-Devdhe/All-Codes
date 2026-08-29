class Solution {

    // Reverse part of the array
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public void rotateArray(int[] nums, int k) {
        k = k % nums.length;

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, nums.length - 1);

        // Reverse complete array
        reverse(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;

        obj.rotateArray(nums, k);

        System.out.print("Rotated Array: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}