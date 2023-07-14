public class Test {
    public static void main(String[] args) {
//Заполнить двухмерный массив 8 х 8 элементами 0 и 1, как на шахматной достке.
// 1 - черное поле, 0 - белое поле Вывести массив на печать.
        int[][] chessboard = new int [8][8];

        for (int i = 0; i < 8; i++ ) {

            for (int j = 0; j < 8; j++) {
                if ((i+j)%2==0) {
                    chessboard[i][j]=1;
                }
                System.out.print(chessboard[i][j] + " ");
            } System.out.println();
        }

    }
}



