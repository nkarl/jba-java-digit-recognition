package recognition;

public class NeuralNet {
    public double[] output;
    public WeightMap[] wMaps;
    public double[] weights;
    static final int DIGITS = 10;

    /**
     * Initializes an array of ten output o's.
     *
     */
    public NeuralNet() {
        var mSize = DigitMap.r_dim * DigitMap.c_dim + 1;
        this.output = new double[DIGITS];
        this.weights = new double[DIGITS];
        this.wMaps = new WeightMap[DIGITS];

        for (int i = 0; i < DIGITS; ++i) {
            this.weights[i] = 0;
            for (int j = 0; j < DigitMap.len; ++j) {
                this.weights[i] += (wMaps[i]).map.get(j);
            }
            this.weights[i] += (wMaps[i]).bias;
        }
    }

    /**
     * Performs a complete computation loop to deduce the correct digit.
     * @param input a given map of input neurons
     * @return the recognized digit
     */
    public double mapReduce(InputMap input) {
//        for (var i = 0; i < 10; ++i) {
//            output[i] = mapToDigit(i, input);
//        }
//        return (output) -> {
//            var list = Collections.singletonList(output);
//            return list.stream().max(Double::compare).get();
//        };
        return -1;
    }


    /**
     * Propagates all weights one generation forward, iff the 'yes' flag is True.
     * @param yes
     * @return
     */
    public double propagate(boolean yes) {
        if (yes) {
            double result = 0;
            // propagate foward one generate
            return result;
        }
        return 0;
    }

//    double mapToDigit(int digit, InputMap input) {
//        double dotProduct = 0;
//        WeightMap w = new WeightMap();
//        int len = DigitMap.len;
//
//        for (var i = 0; i < len; ++i) {
//            dotProduct += (input.map.get(i) * w.get(i));
//        }
//        return sigmoid(dotProduct + w.b);
//    }

    double sigmoid(double x) {
        return (1 / (1 + Math.expm1(-x)));
    }
}

//public class NeuralNet {
//    public int[] biases;
//    public int[] output;
//    InNeurons    input;
//
//    /**
//     * Creates and initialize a digit-recognizer neural network.
//     * @param input the matrix of input-neurons.
//     */
//    public NeuralNet(InNeurons input) {
//        this.output = new int[10];  // for the 10 digits
//        this.biases = new int[10];  // one bias for each digit
//        this.input = input;
//        mapBiases();
//    }
//
//    /**
//     * Computes and reduce the mapping to a recognized digit.
//     * @return the recognized digit.
//     */
//    public int mapReduce() {
//        for (int i = 0; i < 10; ++i) {
//            output[i] = mapToDigit(i) + biases[i];
//        }
//        int max = 0, number = 0;
//        for (int i = 0; i < 10; ++i) {
//            if (this.output[i] >= max) {
//                max = this.output[i];
//                number = i;
//            }
//        }
//        return number;
//    }
//
//    /**
//     * Perform a linear combination of the input matrix and weighted matrix
//     * for a given digit.
//     * @param digit the digit to be reduced to.
//     * @return a scalar
//     */
//    int mapToDigit(int digit) {
//        WeightMap wDigit = new WeightMap();
//        wDigit.mapWeights(digit);
//
//        int r = wDigit.r_dim;
//        int c = wDigit.c_dim;
//        int result = 0;
//        for (int i = 0; i < r; ++i) {
//            for (int j = 0; j < c; ++j) {
//                result += (this.input.map[i][j] * wDigit.map[i][j]);
//            }
//        }
//        return result;
//    }
//
//    /**
//     * hard-coded biases. To be removed at stage 3/6.
//     */
//    void mapBiases() {
//        this.biases[1] = 6;
//        this.biases[2] = 1;
//        this.biases[3] = this.biases[5] = 0;
//        this.biases[4] = 2;
//        this.biases[6] = this.biases[9] = this.biases[0] = -1;
//        this.biases[7] = 3;
//        this.biases[8] = -2;
//    }
//}
