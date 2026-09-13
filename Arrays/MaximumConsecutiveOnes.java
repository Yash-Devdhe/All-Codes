public class MaximumConsecutiveOnes { 
    int Conse(int arr[]){ 
        int count = 1; 
        int maxi = 0; 
        for(int i=1; i<arr.length; i++){ 
            if(arr[i]==1 && arr[i-1] == 1){ 
                count++; 
            } 
            else{ 
                maxi = Math.max(maxi,count); 
                count = 1; 
            } 
        } 
        return maxi; 
    } 

    public static void main(String[] args) { 
        
        int arr[] = {1, 1, 0, 1, 1, 1, 0, 1};

        MaximumConsecutiveOnes m = new MaximumConsecutiveOnes();

        System.out.println(m.Conse(arr));
    } 
}