import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char[][] figure = new char[size][size];
        // initialize the matrix
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                figure[i][j] = '.';
            }
        }
        // iterate over the matrix
        for (int i = 0; i < size; ++i) {
            figure[size / 2][i] = '*';
        }
        int s = size - 1;
        for (int i = 0; i < size / 2; ++i) {
            int h = i, t = s, m = (h + t) / 2;
            figure[i][h] = '*';
            figure[i][m] = '*';
            figure[i][t] = '*';
            figure[s][h] = '*';
            figure[s][m] = '*';
            figure[s][t] = '*';
            s -= 1;
        }
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                System.out.print(figure[i][j]);
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}