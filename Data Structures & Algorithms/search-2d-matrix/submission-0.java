class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rt = 0;
        int rb = matrix.length - 1;
        while(rt <= rb){
            int midi = rt + ((rb - rt)/2);
            System.out.println(midi);
            if (matrix[midi][0] <= target && matrix[midi][matrix[0].length-1] >= target){
                int t = 0;
                int b = matrix[midi].length - 1;
                while(t <= b){
                    int mid = t + ((b - t)/2);
                    if (matrix[midi][mid] < target){
                        t = mid + 1;
                    }
                    else if (matrix[midi][mid] > target){
                        b = mid - 1;
                    }
                    else{
                        return true;
                    }
                }
                return false;
            }
            else if (matrix[midi][0] > target){
                rb = midi - 1;
            }
            else if (matrix[midi][matrix[0].length-1] < target){
                rt = midi + 1;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
