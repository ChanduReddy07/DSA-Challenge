class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        int j=mat[0].length-1;
        for(int i=0; i<n; i++){
            if(i==j){
                sum+=mat[i][i];
                j--;
            }
            else{
                sum+=mat[i][i];
                sum+=mat[i][j];
                j--;
            }
        }
        return sum;
    }
}