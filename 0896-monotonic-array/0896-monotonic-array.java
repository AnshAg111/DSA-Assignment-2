class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag=true;
        int n=nums.length, i=0;
        if(n==1) return flag;
        while(i<n-1 && nums[i]==nums[i+1]) i++;
        if(i==n-1) return flag;
        if(nums[i]>nums[i+1]){
            while(i<n-1){
                if(nums[i]<nums[i+1]) {
                    flag=false;
                    break;
                }
                i++;
            }
        }
        else{
            while(i<n-1){
                if(nums[i]>nums[i+1]){
                    flag=false;
                    break;
                }
                i++;
            }
        }
        return flag;
    }
}