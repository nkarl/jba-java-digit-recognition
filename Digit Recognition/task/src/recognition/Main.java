package recognition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DigitMap input = new DigitMap();
        for (int i = 0; i < input.r_dim; ++i) {
            String line = scanner.nextLine();
            for (int j = 0; j < input.c_dim; ++j) {
//                if (line.charAt(j) == 'X') input.map[i][j] = input.BLUE;
                input.map[i][j] = (line.charAt(j) == '_') ? 0 : 1;
            }
        }
        scanner.close();  // close scanner

        InNeurons in = new InNeurons(input);
        NeuralNet net = new NeuralNet(in);

        int result = net.mapReduce();
        System.out.print("This number is " + result);
    }
}
