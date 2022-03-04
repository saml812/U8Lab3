public class HackerRank {
    public static void main(String[] args) {
        int[][] arr1 = {{-9, -9, -9, 1, 1, 1},
                        {0, -9, 0, 4, 3, 2},
                        {-9, -9, -9, 1, 2, 3},
                        {0, 0, 8, 6, 6, 0},
                        {0, 0, 0, -2, 0, 0},
                        {0, 0, 1, 2, 4, 0}}; //result should be 28

        int[][] arr2 = {{1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}}; //result should be 19
        System.out.println(hourglasssum(arr1));
        System.out.println(hourglasssum(arr2));
    }
    public static int hourglasssum(int[][] arr)
    {
        int max = 0;
        for (int r = 0; r < arr.length-2; r++)
        {
            for (int c = 0; c < arr[0].length - 2; c++)
            {
                int top = arr[r][c] + arr[r][c+1] + arr[r][c+2];
                int middle = arr[r+1][c+1];
                int bottom = arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
                int sum = top + middle + bottom;
                if (sum > max)
                {
                    max = sum;
                }
            }
        }
        return max;
    }
}
