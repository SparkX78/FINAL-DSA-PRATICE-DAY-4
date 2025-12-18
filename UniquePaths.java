public class UniquePaths {
    public static int numberOfways(int rows, int cols){
        int[][]  grid = new int[rows][cols];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <  cols; j++){
                if(i == 0 || j == 0){
                    grid[i][j] = 1;
                }
                else{
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                }
            }
        }
        return grid[rows-1][cols-1];
    }

    public static void main(String[] args){
        int rows = 3;
        int cols = 7;
        System.out.println(numberOfways(rows, cols));
    }
}
