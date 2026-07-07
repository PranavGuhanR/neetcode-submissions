class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<=nums.length-1;i++)
        {
            if (s.contains(nums[i]))
            {
                return true;
            }
            else
            {
                s.add(nums[i]);
            }
        }
        return false;
    }
}