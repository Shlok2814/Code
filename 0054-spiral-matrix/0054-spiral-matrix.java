class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows=matrix.length;
        int cols= matrix[0].length;
       int top=0;
       int bottom=rows-1;
       int left=0;
       int right= cols-1;

       while(top<=bottom && left<=right){
        for(int col=left; col<=right; col++){
            ans.add(matrix[top][col]);
        }
        top++;
        for(int row=top; row<=bottom; row++){
            ans.add(matrix[row][right]);
        }
        right--;
         if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    ans.add(matrix[bottom][col]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    ans.add(matrix[row][left]);
                }
                left++;
            }
       }
       return ans;
    }
}