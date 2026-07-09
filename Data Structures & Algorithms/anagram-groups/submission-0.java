class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<HashMap<Character,Integer>,List<String>> hmc= new HashMap<>();
    int idx=0;
    List<List<String>> ans= new ArrayList<>();
    for (int i=0;i<strs.length;i++)
    {
        HashMap<Character,Integer> c=new HashMap<>();
        for (int j=0;j<strs[i].length();j++)
        {
            c.put(strs[i].charAt(j),c.getOrDefault(strs[i].charAt(j),0)+1);
        }
        if (hmc.containsKey(c))
        {
            hmc.get(c).add(strs[i]);
        }
        else
        {
            List<String> ls= new ArrayList<>();
            ls.add(strs[i]);
            hmc.put(c,ls);
        }
    }  
    for(HashMap<Character,Integer> k: hmc.keySet()) 
    {
        ans.add(hmc.get(k));
    }
    return ans;
    }
}
