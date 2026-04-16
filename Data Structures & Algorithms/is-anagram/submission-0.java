class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap <Character,Integer> hashMap = new HashMap<Character,Integer>();
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        int j = 1;
        if(s.length() == t.length()){
            for(int i = 0 ; i<s.length(); i++){
                if(hashMap.containsKey(S[i])){
                    hashMap.put(S[i],hashMap.get(S[i])+1);
                }
                else{
                    hashMap.put(S[i],j);
                }
            }
            for(int i = 0; i<s.length(); i++){
                if(hashMap.containsKey(T[i]) && hashMap.get(T[i])-1 >= 0){
                    hashMap.put(T[i],hashMap.get(T[i])-1);
                }
                else{
                    return false;
                }
            }
            int sum = 0;
            for( int x : hashMap.values()){
                sum = sum + x;
            }
            if(sum == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
