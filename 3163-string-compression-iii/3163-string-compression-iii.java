class Solution {
    public String compressedString(String word) {
        int c=1;
        StringBuilder result = new StringBuilder();
       for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                c++;
            } else {
                while (c > 9) {
                    result.append(9).append(word.charAt(i - 1));
                    c -= 9;
                }
                result.append(c).append(word.charAt(i - 1));
                c = 1;
            }
        }
        
        
        while (c > 9) {
            result.append(9).append(word.charAt(word.length() - 1));
            c -= 9;
        }
        result.append(c).append(word.charAt(word.length() - 1));

        return result.toString();
    }
}