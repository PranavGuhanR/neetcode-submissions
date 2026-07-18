class Solution {
    public boolean isHappy(int n) {
    HashMap<Integer,Integer> hm= new HashMap<>();
    while(hm.getOrDefault(n,0)==0)
    {
        hm.put(n,1);
        int s=0;
        while(n>0)
        {
            s+=Math.pow((n%10),2);
            n/=10;
        }
        n=s;
    }   
    if(n==1)
    {
        return true;
    } 
    return false;
    }
}
