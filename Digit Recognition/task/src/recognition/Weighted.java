package recognition;

public class Weighted extends DigitMap {

    public void mapInit(int digit) {
        switch(digit){
            case 0:
                for (int j = 0; j < r_dim; ++j) {
                        this.map[j][0] = BLUE;
                        this.map[j][2] = BLUE;
                }
                this.map[0][c_dim / 2] = BLUE;
                this.map[r_dim - 1][c_dim / 2] = BLUE;
                break;

            case 1:
                for (int i = 0; i < r_dim; ++i) {
                    this.map[i][c_dim / 2] = BLUE;
                }
                break;

            case 4:
            case 7:
                for (int i = 0; i < r_dim; ++i) {
                    this.map[i][c_dim - 1] = BLUE;
                }
                if (digit == 7) {
                    this.map[0][0] = this.map[0][1] = BLUE;
                }
                else {
                    for (int i = 0; i < c_dim; ++i) {
                        this.map[i][0] = BLUE;
                    }
                    this.map[2][c_dim / 2] = BLUE;
                }
                break;

            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
                for (int i = 0; i < r_dim; i += 2) {
                    for (int j = 0; j < c_dim; ++j) {
                        this.map[i][j] = BLUE;
                    }
                }
                if (digit == 2) {
                    this.map[1][c_dim - 1] = BLUE;
                    this.map[3][0] = BLUE;
                }
                else if (digit == 3) {
                    this.map[1][c_dim - 1] = BLUE;
                    this.map[3][c_dim - 1] = BLUE;
                }
                else if (digit == 5) {
                    this.map[1][0] = BLUE;
                    this.map[3][c_dim - 1] = BLUE;
                }
                else if (digit == 6) {
                    this.map[1][0] = BLUE;
                    this.map[3][0] = this.map[3][c_dim - 1] = BLUE;
                }
                else if (digit == 8) {
                    this.map[1][0] = this.map[1][c_dim - 1] = BLUE;
                    this.map[3][0] = this.map[3][c_dim - 1] = BLUE;
                }
                else {
                    this.map[1][0] = this.map[1][c_dim - 1] = BLUE;
                    this.map[3][c_dim - 1] = BLUE;
                }
                break;
        }
    }
}
