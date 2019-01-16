package ie.uryuktu.ac.jp.e185708;

public class MainTest {
    public static void main(String[] args){
        BoardTest board = new BoardTest();
        while(true){
            Stone stone = new Stone();
            Stone a = stone.getDate(turn());
            board.putStone(a, board);
            board.getBoard();
            if (board.putStone(a, board)) {
                Reverce reverce = new Reverce(a, board.getBoard());
                reverce.reverce(0, -1);
                reverce.reverce(1, -1);
                reverce.reverce(1, 0);
                reverce.reverce(1, 1);
                reverce.reverce(0, 1);
                reverce.reverce(-1, 1);
                reverce.reverce(-1, 0);
                reverce.reverce(-1, -1);
                System.out.println("石がおかれました");
                turn();
            } else {
                System.out.println();
                System.out.println("指定した位置にはすでに石があります、もう一度選択してください");
            }
        }

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