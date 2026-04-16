class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> array = new ArrayList<>();
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
    //----------------------------------//
        for(String x: strs){
            String z = x;
            char[] c = x.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
          //------------------------//
            if(hashMap.containsKey(s)){
                hashMap.get(s).add(z);
            }
            else{
                hashMap.put(s,new ArrayList<>());
                hashMap.get(s).add(z);
            }
          //------------------------//
        }
        int hashMap_size = hashMap.size();
        Set<String> set = hashMap.keySet();
        int count = 0;
        for(String x: set){
            array.add(hashMap.get(x));
        }
        return array;
    }
}