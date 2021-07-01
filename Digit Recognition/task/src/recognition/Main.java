package recognition;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        var bitmap = new int[size][size];
        for (int i = 0; i < size; ++i) {
            String line = scanner.nextLine();
            for (int j = 0; j < size; ++j) {
                bitmap[i][j] = (line.charAt(j) == '_') ? 0 : 1;
            }
        }

        NeuralNet net = new NeuralNet();
        int neuron = 0;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                neuron += (bitmap[i][j] * net.w[i][j]);
            }
        }
        neuron += net.b;

        int result = (neuron >= 0) ? 0 : 1;

        System.out.println("This number is " + result);
        scanner.close();
    }
}

class NeuralNet {
    int size = 3;
    int[][] w = new int[size][size];
    int b;

    NeuralNet() {
        this.w[0][0] = 2;
        this.w[0][1] = 1;
        this.w[0][2] = 2;
        this.w[1][0] = 4;
        this.w[1][1] = -4;
        this.w[1][2] = 4;
        this.w[2][0] = 2;
        this.w[2][1] = -1;
        this.w[2][2] = 2;
        this.b = -5;
    }
}
