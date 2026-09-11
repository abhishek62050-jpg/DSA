class Solution {
    int sumbyD(int[] nums, int div){
        int sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum=sum+(int)Math.ceil((double)nums[i]/(double)div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int s=1;
        int e=nums[0];
        for(int i=1;i<nums.length;i++){
            e=Math.max(e,nums[i]);
        }
        int ans=e;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(sumbyD(nums,mid)<=threshold){
                ans =mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}