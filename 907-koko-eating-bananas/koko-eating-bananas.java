class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxbanana=0;
        int minbanana=1;
        for(int i=0;i<piles.length;i++){
            maxbanana=Math.max(maxbanana,piles[i]);
        }
        while(minbanana<maxbanana){
            int mid=minbanana+(maxbanana-minbanana)/2;
            int hour=0;
            for(int i=0;i<piles.length;i++){
                if(piles[i]<mid){
                    hour++;
                }else{
                    hour += (piles[i] + mid - 1) / mid;   //imp formula 
                }

            }
            if(hour>h){
                minbanana=mid+1;
            }else{
                maxbanana=mid;

            }
        }
        return minbanana;
        
    }
}