class Solution {
    static int findpivotIndex(int[] nums){
        int n = nums.length;
        int s=0;
        int e=n-1;
        int ans =-1;
        if(nums[s]<nums[e]){
            return-1;
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]<=nums[n-1]){
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;

            }
        }
        return ans;
            }
            static int binarysearch (int nums[],int s, int e, int target){
                while(s<=e){
                    int mid= s+(e-s)/2;
                    if(nums[mid]==target){
                        return mid;
                    }
                    else if (nums[mid]<target){
                        s=mid+1;
                    }
                    else{
                        e=mid-1;
                    }
                }
                return-1;
            }
    public int search(int[] nums, int target) {
        int pivotIndex = findpivotIndex(nums);
        int n= nums.length;
        if(pivotIndex==-1){
            int ans=binarysearch(nums,0,n-1,target);
            return ans;
        }
        else{
          int  StartArray1=0;
           int EndArray1=pivotIndex;
           if(target>=nums[StartArray1]&&target<=nums[EndArray1]){
            int ans = binarysearch(nums,StartArray1,EndArray1,target);
            return ans;
           }
           int StartArray2=pivotIndex+1;
           int EndArray2=n-1;
           if(target>=nums[StartArray2]&&target<=nums[EndArray2]){
            int ans = binarysearch(nums,StartArray2,EndArray2,target);
        return ans;
    }
        }
        return -1;
    }
}

