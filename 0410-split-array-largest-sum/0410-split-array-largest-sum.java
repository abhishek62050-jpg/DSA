class Solution {
    static boolean isValidAnswer(int nums[],int k,int maxpages){
        int studentcount=1;
        int pages=0;
        for(int i=0;i<nums.length;i++){
            if(pages+nums[i]<=maxpages){
                pages=pages+nums[i];
            }
            else{
                studentcount++;
                if(studentcount>k || nums[i]>maxpages){
                    return false;
                }
                else{
                    pages=0;
                    pages=pages+nums[i];
                }
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        if(nums.length<k){
            return-1;
        }
        int n= nums.length;
        int s=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAnswer(nums,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}