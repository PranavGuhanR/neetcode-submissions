class Solution {
    public int climbStairs(int n) {
        if (n<3)
        {
            return n;
        }
        int a=1;
        int b=2;
        int c=a+b;
        for (int i=1;i<=n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;   
        }
        return c;  
    }
}
