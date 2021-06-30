import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; ++i) {
            int seed = 0;
            for (int j = i; j < size; ++j) {
                arr[i][j] = seed;
                arr[j][i] = seed;
                ++seed;
            }
        }

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                System.out.print(arr[i][j]);
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}