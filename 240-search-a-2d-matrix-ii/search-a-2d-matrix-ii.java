class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix.length-1;
        int m=matrix[0].length-1;
        int r=0,c=m;
        while(r <= n && c >= 0 ){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}