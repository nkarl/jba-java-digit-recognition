package recognition;

public class InputNeurons {
    public final short WHITE = -1;
    public final short BLUE = 1;
    public final int Rs = 3;
    public final int Cs = 5;

    public int[][] w ;

    public InputNeurons() {
        this.w = new int[Rs][Cs];

    }
}