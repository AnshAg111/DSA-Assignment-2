class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n=nums.length, mean, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            max=Math.max(max, nums[i]);
            min=Math.min(min, nums[i]);
        }
        float avg=(float)(min+max)/2;
        min=(int)avg;
        max=min+1;
        if((float)max-avg>avg-(float)min) mean=min;
        else mean=max;
        min=Integer.MAX_VALUE;
        max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(nums[i]<mean) nums[i]+=Math.min(k, mean-nums[i]);
            else if(nums[i]>mean) nums[i]-=Math.min(nums[i]-mean, k);
            max=Math.max(max, nums[i]);
            min=Math.min(min, nums[i]);
            // System.out.println(nums[i]);
        }
        return max-min;
    }
}