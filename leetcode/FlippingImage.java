import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for (int i = 0; i < image.length; i++) {
            image[i] = manipulate(image[i]);
        }
        System.out.println(Arrays.deepToString(image));
    }

    public static int[] manipulate(int[] array) {
        int[] new_arr = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            new_arr[index] = array[i];
            index++;
        }
        return invert(new_arr);
    }

    public static int[] invert(int[] invert) {
        for (int i = 0; i < invert.length; i++) {
            invert[i] = invert[i] == 1 ? 0 : 1;
        }
        return invert;
    }
}
