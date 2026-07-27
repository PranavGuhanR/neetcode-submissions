class Solution {
    public int maxArea(int[] heights) {
    int m=0;
    for(int i=0;i<heights.length-1;i++) 
    {
        for(int j=i+1;j<heights.length;j++) 
        {
            int mh=Math.min(heights[i],heights[j]);
            if ((j-i)*mh>m)
                m=(j-i)*mh;
        }
    }  
    return m; 
    }
}
