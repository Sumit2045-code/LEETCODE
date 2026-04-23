class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {

            // skip invalid characters
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            // compare lowercase
            if (Character.toLowerCase(s.charAt(i)) != 
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}