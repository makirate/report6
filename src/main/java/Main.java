/*public class Main {
    public static void main(String[] args){
        BoardTest board = new BoardTest();
        Stone stone = new Stone();
        Stone a = stone.getDate(turn());
        board.putStone(a);
        board.reverse(a);
        board.getBoard();
        turn();

    }
    static int countTurn = 0;

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


// 黒が先攻**/