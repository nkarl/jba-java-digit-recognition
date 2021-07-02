package recognition;

public class NeuralNet {
    public int size = 3;
    public int[][] w = new int[size][size];
    public int b;

    public NeuralNet() {
        this.w[0][0] = 2;
        this.w[0][1] = 1;
        this.w[0][2] = 2;
        this.w[1][0] = 4;
        this.w[1][1] = -4;
        this.w[1][2] = 4;
        this.w[2][0] = 2;
        this.w[2][1] = -1;
        this.w[2][2] = 2;
        this.b = -5;
    }
}
