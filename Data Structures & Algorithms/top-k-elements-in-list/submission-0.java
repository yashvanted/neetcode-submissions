class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap <Integer,Integer> hashMap = new HashMap<>();
        
        for(int num : nums){
            if(hashMap.containsKey(num)){
                hashMap.put(num,hashMap.get(num)+1);
            }
            else{
                hashMap.put(num,1);
            }
        }


        int arr[] = new int[k];
        int max = 0;
        for(int i = 0 ;i<k;i++){
            for(Integer x:hashMap.keySet()){
                if(hashMap.get(x)>max){
                    max = hashMap.get(x);
                    arr[i] = x;
                }
            }
            hashMap.remove(arr[i]);
            max = 0;
        }
        return arr;
    }
}