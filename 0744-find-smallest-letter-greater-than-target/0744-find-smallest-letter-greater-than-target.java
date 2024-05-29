class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // If start is out of bounds, it means all characters in letters are <= target,
        // so we wrap around and return the first character.
        return start < letters.length ? letters[start] : letters[0];
    }
}