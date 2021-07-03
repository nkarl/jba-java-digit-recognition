package recognition;

public class DigitMap {
    public final int WHITE = -1;
    public final int BLUE = 1;
    public final int r_dim = 5;
    public final int c_dim = 3;
    public int[][] map = new int[r_dim][c_dim];

    public DigitMap() {
        for (int i=0; i< r_dim; ++i) {
            for (int j = 0; j < c_dim; ++j) {
                this.map[i][j] = WHITE;
            }
        }
    }
}

