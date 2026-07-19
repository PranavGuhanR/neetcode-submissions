class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]!=9)
            {
                digits[i]+=carry;
                carry=0;
            }
            else
            {
                if (carry!=0)
                {
                    digits[i]=0;
                    carry=1;
                }
                else
                {
                    carry=0;
                }
            }
        }    
        if (carry!=0)
        {
            int[] ans=new int[digits.length+1];
            ans[0]=1;
            for(int j=digits.length-1;j>=0;j--)
            {
                ans[j+1]=digits[j];
            }
            return ans;
        }
            return digits;
        }
    }