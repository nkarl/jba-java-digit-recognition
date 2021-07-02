package recognition;

public class OutputNeurons extends InputNeurons {
    public final int RANGE = 7;
    public int b;
    public int[] numbers = new int[RANGE + 1];

    public int compute() {
        int result = 0;
        System.out.println("This is the computed result." + result);
        return result;
    }
}
