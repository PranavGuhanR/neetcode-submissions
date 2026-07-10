class Solution {
    public boolean same(char c1,char c2){
        int a= (int) ('a');
        int A = (int) ('A');
        int z = (int) ('z');
        int Z = (int) ('Z');
        int Ze = (int) ('0');
        int Ni = (int) ('9');  
        int c1v=(int) c1;  
        int c2v=(int) c2;   
        if(c1v>=Ze && c1v<=Ni)
            return c1v==c2v;
        else
        {
            if ((int) c1>= a )
                c1v+=+A-a;
            if ((int) c2>= a )
                c2v+=+A-a; 
            return c1v==c2v;
        }
    }
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            int a= (int) ('a');
            int A = (int) ('A');
            int z = (int) ('z');
            int Z = (int) ('Z');
            int Ze = (int) ('0');
            int Ni = (int) ('9');
            int lav=(int) (s.charAt(l));
            int rav=(int) (s.charAt(r));
            while((l<r)&&(!((lav>=a && lav<=z)||(lav>=A && lav<=Z)||(lav>=Ze && lav<=Ni))))
            {
                lav=(int) (s.charAt(++l));
            }
            while((l<r)&&(!((rav>=a && rav<=z)||(rav>=A && rav<=Z)||(rav>=Ze && rav<=Ni))))
            {
                rav=(int) (s.charAt(--r));
            }
            if (!(same(s.charAt(l),s.charAt(r))))
                return false;
            l++;
            r--;   
        }
        return true;
    }
}
