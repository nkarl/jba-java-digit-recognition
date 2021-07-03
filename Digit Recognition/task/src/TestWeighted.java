import recognition.Weighted;

public class TestWeighted {
    public static void main (String[] args) {

        Weighted wTest = new Weighted();
        int r = wTest.r_dim;
        int c = wTest.c_dim;

        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                System.out.print(wTest.map[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();


        wTest.mapInit(Integer.parseInt(args[0]));

        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                System.out.print(wTest.map[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println("BLUE: " + wTest.BLUE);
        System.out.println("WHITE : " + wTest.WHITE);
    }
}
