class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dpc=new int[cost.length];
        if(cost.length<3)
            return Math.min(cost[0],cost[1]);
        for(int i=2;i<cost.length;i++)
        {
            dpc[i]=Math.min(dpc[i-1]+cost[i-1],dpc[i-2]+cost[i-2]);
        }
        return Math.min(dpc[cost.length-1]+cost[cost.length-1],dpc[cost.length-2]+cost[cost.length-2]);
    }
}
