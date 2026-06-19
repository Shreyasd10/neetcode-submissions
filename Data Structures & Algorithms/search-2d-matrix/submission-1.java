class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = searchPotentialRow(matrix,target);
        if(rowIdx == -1){
            return false;
        }

        return searchRow(rowIdx,matrix,target);
    }

    private int searchPotentialRow(int[][] matrix, int target){
        int top = 0;
        int bottom = matrix.length - 1;
        int cols = matrix[0].length;

        while(top <= bottom){
            int mid = (top + bottom) / 2;
            if(matrix[mid][0] <= target && target <= matrix[mid][cols -1]){
                return mid;
            }
            else if(matrix[mid][0] > target){
                bottom = mid - 1;
            }
            else{
                top = mid + 1;
            }
        }

        return -1;
    }

    private boolean searchRow(int rowIdx,int[][] matrix, int target){
        int low = 0;
        int high = matrix[rowIdx].length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(matrix[rowIdx][mid] == target){
                return true;
            }
            else if(matrix[rowIdx][mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}
