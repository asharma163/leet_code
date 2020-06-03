package leetcode;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int x_axis = arr.length;
        int y_axis = arr[0].length;
        int[][] final_step = new int[x_axis][y_axis];
        for (int i = 0; i < x_axis; i++) {
            for (int j = 0; j < y_axis; j++) {
                final_step[i][j] = arr[j][i];
            }
        }
        for (int[] e: final_step
             ) {
            for (int element: e
                 ) {
                System.out.println(element);
            }

        }
    }
}
