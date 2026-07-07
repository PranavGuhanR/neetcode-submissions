class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> d= new Hashtable<>();
        for (int i=0;i<=nums.length-1;i++)
        {
            if(d.containsKey(nums[i]))
            {
                return true;
            }
            else
            {
                d.put(nums[i],1);
            }
        }
        return false;
    }
}