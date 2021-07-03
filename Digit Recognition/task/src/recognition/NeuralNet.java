package recognition;

public class NeuralNet {
    public int[] output;
    public int[]   biases;
    InNeurons input;

    public NeuralNet(InNeurons input) {
        this.output = new int[10];  // for the 10 digits
        this.biases = new int[10];  // one bias for each digit
        this.input = input;
        mapBiases();
    }

    void mapReduce() {
        for (int i = 0; i < 10; ++i) {
            output[i] = reduceToDigit(i) + biases[i];
        }
    }
    public int reduceToDigit(int digit) {
        Weighted wDigit = new Weighted();
        wDigit.mapInit(digit);

        int r = wDigit.r_dim;
        int c = wDigit.c_dim;
        int result = 0;
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                result += (this.input.map[i][j] * wDigit.map[i][j]);
            }
        }
        return result;
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
