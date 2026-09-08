class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int s=1;
        int e =1;
        for(int i=0;i<bloomDay.length;i++){
            e=Math.max(e,bloomDay[i]);
        }
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            boolean isvalid=isvalid(bloomDay,m,k,mid);
            if(isvalid){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    static boolean isvalid(int[]bloomDay,int m,int k,int mid){
        int count=0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
         if(bloomDay[i]<=mid){
            count++;
            if(count==k){
                bouquets++;
                count=0;
            }
         }
         else{
            count=0;
         }
        }
        return bouquets>=m;
    }
}