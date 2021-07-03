package recognition;

public class NeuralNet {
    public int[] biases;
    public int[] output;
    InNeurons    input;

    /**
     * Creates and initialize a digit-recognizer neural network.
     * @param input the matrix of input-neurons.
     */
    public NeuralNet(InNeurons input) {
        this.output = new int[10];  // for the 10 digits
        this.biases = new int[10];  // one bias for each digit
        this.input = input;
        mapBiases();
    }

    /**
     * Computes and reduce the mapping to a recognized digit.
     * @return the recognized digit.
     */
    public int mapReduce() {
        for (int i = 0; i < 10; ++i) {
            output[i] = mapToDigit(i) + biases[i];
        }
        int max = 0, number = 0;
        for (int i = 0; i < 10; ++i) {
            if (this.output[i] >= max) {
                max = this.output[i];
                number = i;
            }
        }
        return number;
    }

    /**
     * Perform a linear combination of the input matrix and weighted matrix
     * for a given digit.
     * @param digit the digit to be reduced to.
     * @return a scalar
     */
    int mapToDigit(int digit) {
        Weighted wDigit = new Weighted();
        wDigit.mapWeights(digit);

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

    /**
     * hard-coded biases. To be removed at stage 3/6.
     */
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
