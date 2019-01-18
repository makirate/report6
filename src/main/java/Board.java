import java.util.ArrayList;

public class Board {

    Stone[][] board = new Stone[8][8];

    public Board() {
        //ボードをセットし、出力する

        for (int y = 0; y < 8; y++) {
            System.out.println();
            for (int x = 0; x < 8; x++) {
                if (2 < x && 2 < y && x < 5 && y < 5) {
                    int a = x + y;
                    if (a % 2 == 0) {
                        Stone stone = new Stone(x, y, "W");
                        this.board[y][x] = stone;
                        System.out.print(stone.getColor());
                    } else {
                        Stone stone = new Stone(x, y, "B");
                        this.board[y][x] = stone;
                        System.out.print(stone.getColor());
                    }
                } else {
                    Stone stone = new Stone(x, y);
                    this.board[y][x] = stone;
                    System.out.print(stone.getColor());
                }
            }
        }
    }

    public Stone[][] getBoard() {
        //ボードを出力、返り値はBoardクラスのboard
        for (Stone[] boardX : board) {
            System.out.println();
            for (Stone stone : boardX) {
                System.out.print(stone.getColor());
            }
        }
        return board;
    }


    public boolean putStone(Stone stone,Board board) {
        //石を置く、置けない場所ではfalse を返す
        try{
            int x = stone.getX();
            int y = stone.getY();
            boolean a;
            if(board.board[y][x].getColor().equals("G")){
                a = true;
                board.board[y][x] = stone;
            }else{
                a = false;
            }
            return a;
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("無効な数値です");
        }
        return false;
    }

    static class Reverce {
        //石を裏返すメソッドをここに作る

        private int originalX ;
        private int originalY ;
        private String color;
        private Stone[][] board;
        int x = 0;
        int y = 0;

        ArrayList<Integer[]> placeList = new ArrayList<>();
        //裏返した石の総数

        Reverce(Stone stone, Stone[][] board) {
            this.originalX = stone.getX();
            this.originalY = stone.getY();
            this.color = stone.getColor();
            this.board = board;
        }


        public void reverce(int vectorX, int vectorY){
            //石を裏返す、vectorX,y の方向の石について調べる
            int x = originalX;
            int y = originalY;
            ArrayList<Integer[]> placeList = new ArrayList<>();
            exit : while (!(board[y + vectorY][x + vectorX].getColor().equals("G")) && 0 < y && y < 7 && 0 < x && x < 7) {
                if (!(board[y + vectorY][x + vectorX].getColor().equals(color))) {
                    Integer[] place = {x + vectorX, y + vectorY};
                    placeList.add(place);
                    x += vectorX;
                    y += vectorY;
                    this.x = x;
                    this.y = y;
                } else {
                    if(placeList.size() == 0){
                        break exit;
                    }else{
                        for (int i = 0; i < placeList.size(); i++) {
                            Integer[] a = placeList.get(i);
                            Stone inStone = new Stone(a[0], a[1], color);
                            board[a[1]][a[0]] = inStone;
                            this.placeList.add(a);
                            break exit;
                        }
                    }
                }
            }

        }
    }
}
