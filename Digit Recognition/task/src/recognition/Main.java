package recognition;

public class Main {
    public static void main(String[] args) {
        InputMap input = new InputMap();  // a cluster of input-neurons
        NeuralNet net = new NeuralNet();  // a neural net with given input
//
        double digit = net.mapReduce(input);
        System.out.print("This number is " + digit);
    }
}
