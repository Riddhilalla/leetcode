class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int last = s.length();
        if (s.equals("")) 
        { 
            return true; 
        }
       
            
            for (int i = 0; i < last / 2; i++) 
            { 
                if (s.charAt(i) != s.charAt(last - i - 1)) 
                { 
                    return false; 
                } 
            }
           
            return true; 
        
    }
}