import java.util.ArrayList;

public class Algorithm2DArrays {
    /**
     * Return true if target is found at least once in arr; false otherwise.
     *
     * @param arr    2D array of ints
     * @param target target value to be searched for in arr
     * @return true if target is found at least once in arr; false otherwise
     */
    public static boolean isFound(int[][] arr, int target) {
        for (int[] row : arr) {
            for (int num : row) {
                if (num == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Return the number of elements in arr that contain searchStr as a substring
     *
     * @param arr       2D array of Strings
     * @param searchStr searchStr value to be searched for in each String of arr
     * @return the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr) {
        int count = 0;
        for (String[] row : arr) {
            for (String str : row) {
                if (str.indexOf(searchStr) != -1) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Replaces all even integers in arr with 0; all odd integers are unchanged.
     * <p>
     * THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     * @param arr 2D array of ints
     */
    public static void replaceEvensWithZero(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if ((arr[r][c] % 2) == 0) {
                    arr[r][c] = 0;
                }
            }
        }
    }

    /**
     * Return the sum of all elements of arr that are in the one particular row
     *
     * @param arr 2D array of ints
     * @param row the row to add up
     * @return the sum of all elements in row
     * <p>
     * PRECONDITION:  0 <= row < arr.length (i.e. row will not cause out of bounds)
     */
    public static int sumForRow(int[][] arr, int row) {
        int sum = 0;
        for (int c = 0; c < arr[0].length; c++) {
            sum += arr[row][c];
        }
        return sum;
    }

    /**
     * Return the sum of all elements of arr that are in the one particular column
     *
     * @param arr 2D array of ints
     * @param col the column to add up
     * @return the sum of all elements in column
     * <p>
     * PRECONDITION:  0 <= col < arr[0].length (i.e. col will not cause out of bounds)
     */
    public static int sumForColumn(int[][] arr, int col) {
        int sum = 0;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r][col];
        }
        return sum;
    }

    /**
     * Creates a 2D array of ints of size n x m, where n is number of rows and
     * m is number of columns; the elements in the 2D array should be numbered 0
     * through n x m - 1, with the numbers filled top to bottom, left to right.
     * The method prints the 2D array "grid" of numbers, then finally returns
     * the 2D array.
     * <p>
     * For example, for rows = 3 and cols = 4, this method should print
     * (and return):
     * 0 1 2 3
     * 4 5 6 7
     * 8 9 10 11
     * <p>
     * Each element can be printed with a single space in between (no need to
     * make it "look nice" unless you want to).
     *
     * @param rows number of rows
     * @param cols number of columns
     * @return the same 2D array "number grid" that gets printed by the method
     */
    public static int[][] printNumberGrid(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int temp = 0;
        int number = 0;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                arr[r][c] = c + temp;
                number = arr[r][c];
                System.out.print(number + " ");
            }
            temp = (arr[0].length) * r + arr[0].length;
            System.out.println();
        }
        return arr;
    }

    /**
     * Creates and returns a square 2D array of Strings of size n x n; the
     * elements in the 2D array alternate between "X" and "O" (letter),
     * starting with "X"
     * <p>
     * For example, if n = 5, this method should return the following 2D array
     * (with 5 rows and 5 columns):
     * X O X O X
     * O X O X O
     * X O X O X
     * O X O X O
     * X O X O X
     *
     * @param n number of rows and columns (creating a square 2D array of size n x n)
     * @return a 2D array of Strings that alternate between "X" and "O"
     */
    public static String[][] gridOfXandO(int n) {
        String str = "X";
        String[][] arr = new String[n][n];
        for (int r = 0; r < arr.length; r++)
        {
            for (int c = 0; c < arr[0].length; c++)
            {
                arr[r][c] = str;
                if (str.equals("X"))
                {
                    str = "0";
                }
                else
                {
                    str = "X";
                }
            }
        }
        return arr;
    }
    /** Searches through the 2D array wordChart and finds all strings with
     *  length len; these strings are added to an ArrayList and returned.
     *  If no strings have that length, return an empty ArrayList
     *
     *  @param wordChart  2D array of Strings
     *  @parram len  the length of strings to search for
     *  @return  an ArrayList containing all strings in wordChart with length len
     */
    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len)
    {
        ArrayList<String> arr = new ArrayList<String>();
        for (int r = 0; r < wordChart.length; r++)
        {
            for (int c = 0; c < wordChart[0].length; c++)
            {
                if ( wordChart[r][c].length() == len)
                {
                    arr.add(wordChart[r][c]);
                }
            }
        }
        return arr;
    }

}
