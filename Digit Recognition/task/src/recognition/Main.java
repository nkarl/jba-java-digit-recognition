package recognition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        var bitmap = new int[size][size];
        for (int i = 0; i < size; ++i) {
            String line = scanner.nextLine();
            for (int j = 0; j < size; ++j) {
                bitmap[i][j] = (line.charAt(j) == '_') ? -1 : 1;
            }
        }
    
        OutputNeurons net = new OutputNeurons();
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
