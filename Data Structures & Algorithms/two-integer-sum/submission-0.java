class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap itv = new HashMap<>();
    int idx=0;
    for (int num:nums)
    {
        if (!(itv.containsKey(num)))
        {
            itv.put(num,idx);
        }
        idx++;
    } 
    for (int i=nums.length-1;i>=0;i--) 
    {
        if (itv.containsKey(target-nums[i]))
        {
            int fi=(int) (itv.get(target-nums[i]));
            int[] a={fi,i};
            return a;
        }
    }  
    int[] a={0,0};
    return a;
    }
}