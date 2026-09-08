class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] a=new int[k];
        int j=0,i=1,s=0;
        while(s<k){
            if(j==arr.length){
                a[s]=i;
                s++;
            }
            else if(i != arr[j] ){
                a[s]=i;
                s++;

            }else{
                j++;
            }
            i++;
        }
        return a[k-1];
        
    }
}