/*import java.util.ArrayList;

public class Board {
    Stone stone = new Stone();


    Stone[][] board = new Stone[8][8];

    public Board(){

        for(int y = 0; y < 8; y++){
            System.out.println();
            for(int x = 0; x < 8; x++){
                if(2<x && 2<y && x<5 && y<5){
                    int a = x+y;
                    if(a%2 == 0){
                        Stone stone = new Stone(x,y,"W");
                        this.board[y][x] = stone;
                        System.out.print(stone.getColor());
                    }else{
                        Stone stone = new Stone(x,y,"B");
                        this.board[y][x] = stone;
                        System.out.print(stone.getColor());
                    }
                }
                else{
                Stone stone = new Stone(x,y);
                this.board[y][x] = stone;
                System.out.print(stone.getColor());
            }
            }
        }
    }

    public Stone[][] getBoard(){
        for(Stone[] boardX : board){
            System.out.println();
            for(Stone stone : boardX){
                System.out.print(stone.getColor());
        }
    }
    return board;
    }


    public void putStone(Stone stone){
        int x = stone.getX();
        int y = stone.getY();
        this.board[y][x] = stone;
    }

    public void reverse(Stone stone) {
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
            while(){}
            while(){}
            while(){}
            while(){}
            while(){}
            while(){}
        } else {

        }

    }

}}**/