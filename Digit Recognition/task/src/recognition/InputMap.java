package recognition;

import java.util.Arrays;
import java.util.Scanner;

public class InputMap extends DigitMap<Integer> {
    public InputMap() {
        this.map = Arrays.asList(new Integer[len]);
        Scanner scanner = new Scanner(System.in);
        String input = "";
        for (int i = 0; i < r_dim; ++i) {
            input += scanner.nextLine();
        }
        for (int i = 0; i < len; ++i) {
            if (input.charAt(i) == '_') this.map.set(i, 0);
            else this.map.set(i, 1);
        }
    }
}

//public class InNeurons extends DigitMap {
//    /**
//     * Maps the raw text input to an integer matrix.
//     */
//    public InNeurons() {
//        Scanner scanner = new Scanner(System.in);
//        // map the raw string to the weighted input-neurons
//        for (int i = 0; i < r_dim; ++i) {
//            String line = scanner.nextLine();
//            for (int j = 0; j < c_dim; ++j) {
//                this.map[i][j] = (line.charAt(j) == '_') ? 0 : 1;
//            }
//        }
//        scanner.close();  // close scanner
//    }
//}
