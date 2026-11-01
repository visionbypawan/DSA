class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] bucket=new ArrayList[nums.length+1];
        Map<Integer,Integer> fm=new HashMap<>();
        for(int n:nums){
            fm.put(n,fm.getOrDefault(n,0)+1);
        }
        for(int key:fm.keySet()){
            int freq=fm.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] res=new int[k];
        int counter=0;
        for(int pos=bucket.length-1;pos>=0 && counter<k;pos--){
            if(bucket[pos]!=null){
                for(Integer integer:bucket[pos]){
                    res[counter++]=integer;
                }
            }
        }
        return res;
    }
}