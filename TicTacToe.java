import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x_board = new int[9];
        int[] o_board = new int[9];
        int turns = 1;
        int total_turns = 0;
        while (true){
            if(total_turns==9){
                System.out.println("Match Drawn!");
                break;
            }
            if(turns == 1){
                drawBoard(x_board,o_board);
                System.out.print("Player X enter position: ");
                int i = in.nextInt();
                if(o_board[i]==1){
                    System.out.println("Place already taken! Try again!");
                    continue;
                }
                else{
                    x_board[i] = 1;
                    if(checkWin(x_board)){
                        System.out.println("Player X won!");
                        break;
                    }
                    turns = 1 - turns;
                    total_turns++;
                }
            }
            else {
                drawBoard(x_board,o_board);
                System.out.print("Player O enter position: ");
                int i = in.nextInt();
                if(x_board[i]==1){
                    System.out.println("Place already taken! Try again!");
                    continue;
                }
                else{
                    o_board[i] = 1;
                    if(checkWin(o_board)){
                        System.out.println("Player O won!");
                        break;
                    }
                    turns = 1 - turns;
                    total_turns++;
                }
            }
        }
    }

    public static void drawBoard(int[] x_board, int[] o_board){
        char one = x_board[0] == 1? 'X':(o_board[0] == 1? 'O': '0');
        char two = x_board[1] == 1? 'X':(o_board[1] == 1? 'O': '1');
        char three = x_board[2] == 1? 'X':(o_board[2] == 1? 'O': '2');
        char four = x_board[3] == 1? 'X':(o_board[3] == 1? 'O': '3');
        char five = x_board[4] == 1? 'X':(o_board[4] == 1? 'O': '4');
        char six = x_board[5] == 1? 'X':(o_board[5] == 1? 'O': '5');
        char seven = x_board[6] == 1? 'X':(o_board[6] == 1? 'O': '6');
        char eight = x_board[7] == 1? 'X':(o_board[7] == 1? 'O': '7');
        char nine = x_board[8] == 1? 'X':(o_board[8] == 1? 'O': '8');
        System.out.println(one+" | "+two+" | "+three);
        System.out.println("---------");
        System.out.println(four+" | "+five+" | "+six);
        System.out.println("---------");
        System.out.println(seven+" | "+eight+" | "+nine);
    }

    public static boolean checkWin(int[] board){
        if((board[0] == 1 && board[1] == 1 && board[2] == 1)||(board[3] == 1 && board[4] == 1 && board[5] == 1)||(board[6] == 1 && board[7] == 1 && board[8] == 1)||(board[0] == 1 && board[3] == 1 && board[6] == 1)||(board[1] == 1 && board[4] == 1 && board[7] == 1)||(board[2] == 1 && board[5] == 1 && board[8] == 1)||(board[0] == 1 && board[4] == 1 && board[8] == 1)||(board[2] == 1 && board[4] == 1 && board[6] == 1)){
            return true;
        }
        return false;
    }
}
