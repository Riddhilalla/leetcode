class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder result = new StringBuilder(s);
        
        if(s.length() != goal.length()) return false;
        else{
            for (int i = 0; i < s.length(); i++) 
            { // Rotate the string by moving the first character to the end 
            result.append(result.charAt(0)); 
            result.deleteCharAt(0); // Check if the rotated string equals the goal string 
            if (result.toString().equals(goal)) 
            { 
                return true; 
            } 
            } 
        }
        return false;
        
    }
}