class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String p = ""; 
        char ch; 
        for (int i = s.length() - 1; i >= 0; i--) 
        {
             ch = s.charAt(i);
             p += ch; 
             
        } 
        if (s.equals("")) 
        { 
            return true; 
        }
        else { 
            for (int i = 0; i < s.length(); i++) 
            { 
                if (s.charAt(i) != p.charAt(i)) 
                { 
                    return false; 
                } 
            } 
            return true; 
        }
    }
}