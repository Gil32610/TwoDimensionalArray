public class TwoDimensionalArray {
    private int array[][];

    public TwoDimensionalArray(int rows, int columns) {
        this.array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                array[i][j] = Integer.MIN_VALUE;
            }
        }
    }
}
