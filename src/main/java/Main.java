public class Main {
    public static void main(String[] args){
        Board board = new Board();
        while(true){
            Stone stone = new Stone();
            Stone a = stone.getDate(turn());
            boolean b = board.putStone(a,board);
            if (b) {
                Board.Reverce r = new Board.Reverce(a, board.board);
                r.reverce(0, -1);
                r.reverce(1, -1);
                r.reverce(1, 0);
                r.reverce(1, 1);
                r.reverce(0, 1);
                r.reverce(-1, 1);
                r.reverce(-1, 0);
                r.reverce(-1, -1);
                //int z = c + d + e + f + g + h + i + j;
                int z = r.placeList.size();
                if(z == 0){
                    Stone greenStone = new Stone();
                    board.board[a.getY()][a.getX()] = greenStone;
                    System.out.println();
                    System.out.println("pass");
                }else{}
            } else {
                System.out.println("指定した位置にはすでに石があります、もう一度選択してください");
                countTurn-- ;
            }
            System.out.println();
            board.getBoard();
            settelment(board);
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

    public static void settelment(Board board){
        int countW = 0;
        int countB = 0;
        int countG = 0;
        String winer ="a";
        for(Stone[] boardX : board.board){
            for(Stone onStone: boardX){
                switch(onStone.getColor()){
                    case "B" :
                        countB++ ;
                        break;
                    case "W" :
                        countW++ ;
                        break;
                    default :
                        countG++ ;
                }

            }
            if(countB >= countW){
                winer = "B";
            }else{
                winer = "W";
            }
        }
        if(countW == 0 || countB == 0 || countG == 0){
            System.out.println();
            System.out.println(countTurn + "手");
            System.out.println("B :" + countB + " W :" + countW);
            System.out.println(winer + "の勝利です");
            System.out.println("おめでとうございます");
            System.exit(0);}
    }

}


// 黒が先