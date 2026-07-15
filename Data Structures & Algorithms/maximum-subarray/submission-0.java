class Solution {
    public int maxSubArray(int[] nums) {
        int[] ps=new int[nums.length+1];
        ps[0]=0;
        for(int i=0;i<nums.length;i++)
        {
            ps[i+1]=ps[i]+nums[i];
        }
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length+1;j++)
            {
                if(ps[j]-ps[i]>maxi)
                {
                    maxi=ps[j]-ps[i];
                }
            }
        }
        return maxi;
    }
}
