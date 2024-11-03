class Solution {
    public String makeFancyString(String s) {
        int count = 1;
        if ( s.length() < 3) return s;
        StringBuilder result = new StringBuilder();
         result.append(s.charAt(0));

       for(int i = 1;i<s.length(); i++){
            if(s.charAt(i) == (s.charAt(i-1))){
                count++;
            }
            else{
                count =1;
            }
            if(count < 3){
                result.append(s.charAt(i));
            }
         }
       
      return result.toString();
    }
}