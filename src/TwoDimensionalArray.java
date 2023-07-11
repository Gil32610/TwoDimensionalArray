public class TwoDimensionalArray {
    private int array[][];

    public TwoDimensionalArray(int rows, int columns) {
        this.array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValue(int rowIndex, int columnIndex, int value) {
        try {
            if (array[rowIndex][columnIndex] == Integer.MIN_VALUE) {
                array[rowIndex][columnIndex] = value;
                System.out.printf("%d was inserted at %d row and %d column%n", value, rowIndex, columnIndex);
            }else System.out.println("Cell already occupied");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot access index");
        }
    }

    public void accessCell(int rowIndex,int columnIndex){
        System.out.printf("Accessing row #%d and column #%d%n",rowIndex,columnIndex);
        try{
            System.out.println("Cell value is: " + array[rowIndex][columnIndex]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot access index");
        }
    }

    public int[][] getArray() {
        return array;
    }
}
