package recognition;

import java.util.Scanner;

public class InNeurons extends DigitMap {
    /**
     * Maps the raw text input to an integer matrix.
     */
    public InNeurons() {
        Scanner scanner = new Scanner(System.in);
        // map the raw string to the weighted input-neurons
        for (int i = 0; i < r_dim; ++i) {
            String line = scanner.nextLine();
            for (int j = 0; j < c_dim; ++j) {
                this.map[i][j] = (line.charAt(j) == '_') ? 0 : 1;
            }
        }
        scanner.close();  // close scanner
    }
}
