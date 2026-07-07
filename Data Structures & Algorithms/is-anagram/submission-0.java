class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character,Integer> hts= new Hashtable<>();
        for (int i=0;i<=s.length()-1;i++)
        {
            if(hts.containsKey(s.charAt(i)))
            {
                hts.put(s.charAt(i),hts.get(s.charAt(i))+1);
            }
            else
            {
                hts.put(s.charAt(i),1);
            }
        }
        Hashtable<Character,Integer> htt= new Hashtable<>();
        for (int i=0;i<=t.length()-1;i++)
        {
            if(htt.containsKey(t.charAt(i)))
            {
                htt.put(t.charAt(i),htt.get(t.charAt(i))+1);
            }
            else
            {
                htt.put(t.charAt(i),1);
            }
        }
        if(hts.equals(htt))
        {
            return true;
        }
        return false;
    }
}
