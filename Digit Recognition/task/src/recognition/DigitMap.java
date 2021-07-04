package recognition;
import java.util.Arrays;
import java.util.List;

/**
 * The base class for all implemented mappings; a 5x3 matrix.
 */
public abstract class DigitMap<T> {
    // class attributes
    public static final int r_dim = 5;
    public static final int c_dim = 3;
    public static final int WHITE = -1;
    public static final int BLUE = 1;
    static int len = r_dim * c_dim + 1;

    protected List<T> map;
}


//public class DigitMap {
//    public final int WHITE = -1;
//    public final int BLUE = 1;
//    public final int r_dim = 5;
//    public final int c_dim = 3;
//    public int[][] map = new int[r_dim][c_dim];
//
//    /**
//     * Initializes all to WHITE because computation is the most heavy at
//     * generating weighted matrices.
//     */
//    public DigitMap() {
//        for (int i=0; i< r_dim; ++i) {
//            for (int j = 0; j < c_dim; ++j) {
//                this.map[i][j] = WHITE;
//            }
//        }
//    }
//}
