class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        ArrayList<Character>[] bucket=new ArrayList[s.length() + 1];
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character key:hm.keySet()){
            int freq=hm.get(key);
            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        StringBuilder sb=new StringBuilder();
        for(int pos = bucket.length - 1; pos >= 0; pos--) {
            if(bucket[pos] != null) {
                for(Character ch : bucket[pos]) {
                    for(int j = 0; j < pos; j++) {
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}
