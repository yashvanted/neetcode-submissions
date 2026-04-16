class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Set<Character> hashSet = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int right = 0; right < len; right++){
            if(hashSet.add(s.charAt(right)) == true){
                max = Math.max(hashSet.size(), max);
            }
            else{
                while(hashSet.add(s.charAt(right)) != true){
                    hashSet.remove(s.charAt(left));
                    left++;
                }
                hashSet.add(s.charAt(right));
            }
        }
        return max;


    }
}