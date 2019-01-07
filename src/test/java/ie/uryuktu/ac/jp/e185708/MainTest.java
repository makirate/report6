package ie.uryuktu.ac.jp.e185708;

public class MainTest {
    public static void main(String[] args){
        BoardTest board = new BoardTest();
        Stone stone = new Stone();
        board.putStone(stone.getDate("W"));
        board.getBoard();


    }
}
