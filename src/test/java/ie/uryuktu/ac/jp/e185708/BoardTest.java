package ie.uryuktu.ac.jp.e185708;
import java.util.*;
public class BoardTest {

    Stone[][] board = new Stone[8][8];

    public BoardTest() {

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
        for (Stone[] boardX : board) {
            System.out.println();
            for (Stone stone : boardX) {
                System.out.print(stone.getColor());
            }
        }
        return board;
    }


    public boolean putStone(Stone stone,BoardTest board) {
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
    }
}

class Reverce {

    private int originalX ;
    private int originalY ;
    private String color;
    private Stone[][] board;
    int x = 0;
    int y = 0;

    ArrayList<Integer[]> placeList = new ArrayList<>();

    Reverce(Stone stone, Stone[][] board) {
        this.originalX = stone.getX();
        this.originalY = stone.getY();
        this.color = stone.getColor();
        this.board = board;
    }


    public int reverce(int vectorX, int vectorY){
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
        return placeList.size();

    }
}


