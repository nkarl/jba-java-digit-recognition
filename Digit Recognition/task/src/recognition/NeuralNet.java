package recognition;

import java.util.Scanner;

public class NeuralNet extends DigitMap {
    public int[][] inputCells;
    public int[] outCells;
    public int[] biases;

    public NeuralNet() {
        this.inputCells= this.map;

        Scanner scanner = new Scanner(System.in);
        // map the raw string to the weighted (edge) input cells
        for (int i = 0; i < r_dim; ++i) {
            String line = scanner.nextLine();
            for (int j = 0; j < c_dim; ++j) {
                this.inputCells[i][j] = (line.charAt(j) == '_') ? 0 : 1;
            }
        }
        this.outCells = new int[10];  // for the 10 digits
        this.biases = new int[10];  // one bias for each digit
        mapBiases();
        scanner.close();  // close scanner
    }

    public void reduce(int digit) {
        int result;
    }

    void mapBiases() {
        this.biases[1] = 6;
        this.biases[2] = 1;
        this.biases[3] = this.biases[5] = 0;
        this.biases[4] = 2;
        this.biases[6] = this.biases[9] = this.biases[0] = -1;
        this.biases[7] = 3;
        this.biases[8] = -2;
    }
}