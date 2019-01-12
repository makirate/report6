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


    public void putStone(Stone stone) {
        int x = stone.getX();
        int y = stone.getY();
        this.board[y][x] = stone;
    }
}

class Reverce{

    private int moveX = 0;
    private int moveY = 0;
    private int originalX;
    private int originalY;
    private int x = moveX + originalX;
    private int y = moveY + originalY;
    private String color;
    private Stone[][] board;

    private ArrayList<Integer[]> placeList = new ArrayList<>();

    Reverce(Stone stone, Stone[][] board) {
        this.originalX = stone.getX();
        this.originalY = stone.getY();
        this.color = stone.getColor();
        this.board = board;
    }


    public void reverce(int vectorX, int vectorY){
        System.out.println(board[y][x].getColor());
        for (Stone[] boardX : board) {
            System.out.println();
            for (Stone stone : boardX) {
                System.out.print(stone.getColor());
            }
        }
        System.out.println();

        while (!(board[y + vectorY][x + vectorX].getColor().equals("G")) && 0 < y && y < 7 && 0 < x && x < 7) {
            if (!(board[y + vectorX][x + vectorY].getColor().equals(color))) {
                Integer[] place = {x + vectorX, y + vectorY};
                placeList.add(place);
                this.moveX += vectorX;
                this.moveY += vectorY;
                System.out.println("if");
            } else {
                System.out.println("else");
                for (int i = 0; i < placeList.size(); i++) {
                    Integer[] a = placeList.get(i);
                    Stone inStone = new Stone(a[0], a[1], color);
                    board[a[1]][a[0]] = inStone;
                }
            }
            break;
        }
    }
}


    /*public void reverse(Stone stone) {
        if (stone.getColor().equals("B")) {
            int x = stone.getX();
            int y = stone.getY();
            int[] listY = {y,y,y,y,y,y};
            int[] listX = {x,x,x,x,x,x};
            ArrayList<Integer[]> placeList = new ArrayList<>();
            ArrayList<Integer[]> placeList2 = new ArrayList<>();
            ArrayList<Integer[]> placeList3 = new ArrayList<>();
            ArrayList<Integer[]> placeList4 = new ArrayList<>();
            ArrayList<Integer[]> placeList5 = new ArrayList<>();
            ArrayList<Integer[]> placeList6 = new ArrayList<>();
            ArrayList<Integer[]> placeList7 = new ArrayList<>();
            ArrayList<Integer[]> placeList8 = new ArrayList<>();

            while(!(board[listY[0]-1][x].getColor().equals("G")) && 0<listY[0]){

                if(board[listY[0]-1][x].getColor().equals("W")){
                Integer[] place = {x,listY[0]-1};
                listY[0]--;
                placeList.add(place);
                }else{
                    for(int i = 0; i < placeList.size(); i++) {
                        Integer[] a = placeList.get(i);
                        Stone inStone = new Stone(a[0],a[1],"B");
                        putStone(inStone);
                    }
                    break;
                }


            }
            while(!(board[listY[1]-1][listX[0]+1].getColor().equals("G")) && 0<listY[1] && listX[0]<7 ){
                if(board[listY[1]-1][listX[0]].getColor().equals("W")){
                    Integer[] place = {listX[0]+1,listY[1]-1};
                    listY[1]--;
                    listX[0]++;
                    placeList2.add(place);
                }else{
                    for(int i = 0; i < placeList2.size(); i++){
                        Integer[] a = placeList2.get(i);
                        Stone inStone = new Stone(a[0],a[1],"B");
                        putStone(inStone);
                    }

                }
            }
        } else {

        }

    }**/

