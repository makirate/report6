package jp.ac.uryukyu.ie.e185708;

public class Main {
    public static void main(String[] args){
        Board board = new Board();
        //ボードを持ってくる
        while(true){
            Stone stone = new Stone();
            Stone a = stone.getDate(turn());
            //置く石の設定
            boolean b = board.putStone(a,board);
            if (b) {
                //裏返す
                Board.Reverce r = new Board.Reverce(a, board.board);
                r.reverce(0, -1);
                r.reverce(1, -1);
                r.reverce(1, 0);
                r.reverce(1, 1);
                r.reverce(0, 1);
                r.reverce(-1, 1);
                r.reverce(-1, 0);
                r.reverce(-1, -1);
                int z = r.placeList.size();
                if(z == 0){
                    //何も裏返らない時
                    Stone greenStone = new Stone();
                    board.board[a.getY()][a.getX()] = greenStone;
                    System.out.println();
                    System.out.println("pass");
                }else{}
            } else {
                //putStone()がfalse の時
                System.out.println("指定した位置はすでに石があるか、ボードの範囲外です");
                System.out.println("もう一度選択してください");
                countTurn-- ;
            }
            System.out.println();
            board.getBoard();
            settelment(board);
        }

    }
    private static int countTurn = 0;

    public static String turn(){
        //ターンの色を返す

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
        //決着がついた時、終了する

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


// 黒が先攻