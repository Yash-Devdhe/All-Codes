import java.util.Scanner;

class Solution { 
    public int minimumRateToEatBananas(int[] nums, int h) { 
        int low = 1;
int high = 0;

for(int i = 0; i < nums.length; i++){
    high = Math.max(high, nums[i]);
}

while(low <= high){

    int mid = low + (high - low) / 2;

    int count = 0;

    for(int i = 0; i < nums.length; i++){
        count += (int)Math.ceil((double)nums[i] / mid);
    }

    if(count <= h){
        high = mid - 1;
    }
    else{
        low = mid + 1;
    }
}

return low;
    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter banana piles:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter number of hours: ");
        int h = sc.nextInt();

        Solution obj = new Solution();

        int result = obj.minimumRateToEatBananas(nums, h);

        System.out.println("Minimum Eating Rate: " + result);

        sc.close();
    }
}