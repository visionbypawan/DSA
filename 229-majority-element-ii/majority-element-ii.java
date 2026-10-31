class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);

            }else{
                hm.put(nums[i],1);
            }
        }
        Set<Integer> keys=hm.keySet();
        for(int k: keys){
            if(hm.get(k)>nums.length/3){
                l.add(k);
            }
            
        }
        return l;
        
    }
}