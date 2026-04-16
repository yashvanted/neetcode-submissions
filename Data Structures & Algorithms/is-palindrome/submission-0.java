class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder();
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9A-Za-z]","");
        rev.append(s);
        rev.reverse();
        String s1 = rev.toString();
        if(s.equals(s1)){
            return true;
        }
        else{
            return false;
        }
    }
}