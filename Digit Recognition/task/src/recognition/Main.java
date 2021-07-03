package recognition;

public class Main {
    public static void main(String[] args) {
        InNeurons input = new InNeurons();  // a cluster of input-neurons
        NeuralNet net = new NeuralNet(input);  // a neural net with given input

        int digit = net.mapReduce();
        System.out.print("This number is " + digit);
    }
}
