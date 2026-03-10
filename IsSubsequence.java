class Solution {
    public boolean isSubsequence(String s, String t) {
       int pos = -1;

        for (int i = 0; i < s.length(); i++) {
            pos = t.indexOf(s.charAt(i), pos + 1);
            
            if (pos == -1) {
                return false;
            }
        }
        return true;
    }
}
