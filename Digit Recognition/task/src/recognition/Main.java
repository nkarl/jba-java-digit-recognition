package recognition;

public class Main {
    public static void main(String[] args) {
        InNeurons input = new InNeurons();
        NeuralNet net = new NeuralNet(input);
        int max = 0;
        for (var o : net.output) {
            if (o > max) {
                max = o;
            }
        }
        System.out.println("This number is " + max);
    }
}
