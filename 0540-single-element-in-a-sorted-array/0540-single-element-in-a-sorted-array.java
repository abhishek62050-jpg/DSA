class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s=0;
        int e= n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(s==e){
                return nums[e];
            }
            int currentvalue=nums[mid];
            int previousvalue=-1;
            if(mid-1>=0){
                previousvalue=nums[mid-1];
            }
            int nextvalue=-1;
            if(mid+1<n){
                nextvalue=nums[mid+1];
            }
            if(currentvalue!=previousvalue && currentvalue!=nextvalue){
                return currentvalue;
            }
            if(currentvalue!=previousvalue && currentvalue==nextvalue){
                int startingindexofpair=mid;
                if((startingindexofpair &1)==1){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else if(currentvalue==previousvalue && currentvalue!=nextvalue){
                int endingindexofpair=mid;
                if((endingindexofpair &1)==1){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;

        
    }
}