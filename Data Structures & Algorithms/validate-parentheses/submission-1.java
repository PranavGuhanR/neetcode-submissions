class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc=new  Stack<>();
        String ob=")}]";
        for(int i=0; i<s.length(); i++)
        {
            if (ob.contains(Character.toString(s.charAt(i))))
            {
                if (sc.empty())
                    return false;
                if (s.charAt(i)==sc.peek())
                    sc.pop();
                else
                    return false;          
            }
            else
            {
                char cs=s.charAt(i);
                if (cs=='{')
                    sc.push('}');
                else if(cs=='[') 
                    sc.push(']');
                else
                    sc.push(')');     
            } 
        }
        if (sc.empty())
            return true;
        return false;    
    }
}
