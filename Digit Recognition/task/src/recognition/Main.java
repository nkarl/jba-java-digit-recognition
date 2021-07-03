package recognition;

public class Main {
    public static void main(String[] args) {
        // Instantiate a cluster of input-neurons
        InNeurons input = new InNeurons();
        // Instantiate a neural net with given input
        NeuralNet net = new NeuralNet(input);

        // Check and realize the digit
        int digit = net.mapReduce();
        System.out.print("This number is " + digit);
    }
}
