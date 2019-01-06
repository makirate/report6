import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Board board = new Board();
        board.setBoard();
        System.out.println();
        System.out.print("どこに置きますか？");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(str);
    }

}
