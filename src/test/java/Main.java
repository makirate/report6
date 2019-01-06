import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Board board = new Board();
        board.setBoard();
        System.out.println();
        System.out.print("どこに置きますか？");
        //Scanner scan = new Scanner(System.in);
        //String str = scan.next();
        //System.out.println(str);
        PutStone putstone = new PutStone();
        int exampleX = putstone.getPlaceX();
        int exampleY = putstone.getPlaceY();
        System.out.println(exampleX);
        System.out.println(exampleY);
    }

}
