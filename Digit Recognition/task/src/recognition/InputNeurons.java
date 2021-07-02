package recognition;

import java.util.Scanner;

public class InputNeurons {
    public final int WHITE = -1;
    public final int BLUE = 1;
    public final int r_dim = 5;
    public final int c_dim = 3;
    public int[][] inNeurons;  // the input cells

    public InputNeurons() {
        Scanner scanner = new Scanner(System.in);
        this.inNeurons = new int[r_dim][c_dim];  // instantiate a new RW x CL matrix
        // map the raw string to the input cells
        for (int i = 0; i < r_dim; ++i) {
            String line = scanner.nextLine();
            for (int j = 0; j < c_dim; ++j) {
                this.inNeurons[i][j] = (line.charAt(j) == '_') ? WHITE : BLUE;
            }
            scanner.close();
        }
    }
}