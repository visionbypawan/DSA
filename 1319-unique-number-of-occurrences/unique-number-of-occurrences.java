class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm1.containsKey(arr[i])){
                hm1.put(arr[i],hm1.get(arr[i])+1);

            }else{
                hm1.put(arr[i],1);
            }
        }
        Set<Integer> keys=hm1.keySet();
        for(int k: keys){
            hm2.put(hm1.get(k),k);
        }
        if(hm1.size()!=hm2.size()){
            return false;
        }else{
            return true;
        }
        
    }
}