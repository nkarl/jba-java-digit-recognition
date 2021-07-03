package recognition;

import java.util.Scanner;

public class InNeurons extends DigitMap {
    public InNeurons() {
        Scanner scanner = new Scanner(System.in);

        // map the raw string to the weighted (edge) input cells
        for (int i = 0; i < r_dim; ++i) {
            String line = scanner.nextLine();
            for (int j = 0; j < c_dim; ++j) {
                this.map[i][j] = (line.charAt(j) == '_') ? WHITE : BLUE;
            }
        }
        scanner.close();  // close scanner
    }
}
