import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] int2DArray;
        int2DArray = new int[2][2];
        for (int i = 0; i < int2DArray.length; i++) {
            for (int j = 0; j < int2DArray[0].length ; j++) {
                int2DArray[i][j] = 5;
            }
        }
        System.out.println(Arrays.deepToString(int2DArray));

        String s2DArray[][] = { {"Lisa Lisa", "Zeppelli"},{"SpeedWagon","JoeStar"}};
        System.out.println(Arrays.deepToString(s2DArray));
    }
}
