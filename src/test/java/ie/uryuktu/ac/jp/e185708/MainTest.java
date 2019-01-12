package ie.uryuktu.ac.jp.e185708;

public class MainTest {
    public static void main(String[] args){
        BoardTest board = new BoardTest();
        //System.out.println(board.board[4][4].getColor());
        Stone stone = new Stone();
        Stone a = stone.getDate(turn());
        board.putStone(a);
        Reverce reverce = new Reverce(a,board.board);
        reverce.reverce(0,0);
        /*reverce.reverce(0,-1);
        reverce.reverce(1,-1);
        reverce.reverce(1,0);
        reverce.reverce(1,1);
        reverce.reverce(0,1);
        reverce.reverce(-1,1);
        reverce.reverce(-1,0);
        reverce.reverce(-1,-1);**/
        board.getBoard();
        turn();

    }
    private static int countTurn = 0;

    public static String turn(){
        String a ;
        System.out.println();
        if(countTurn % 2 == 0){
            a = "B";
            countTurn++;
        }else{
            a = "W";
            countTurn++;
        }
        System.out.println(a+"のターンです");
        return a;
    }

    public static void settelment(){
        System.exit(0);

    }

}


// 黒が先攻