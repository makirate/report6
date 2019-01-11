package ie.uryuktu.ac.jp.e185708;

public class BoardTest {
    Stone stone = new Stone();

    Stone[][] board = new Stone[8][8];
    public BoardTest(){

        for(int y = 0; y < 8; y++){
            System.out.println();
            for(int x = 0; x < 8; x++){
                if(2<x && 2<y && x<5 && y<5){
                    int a = x+y;
                    if(a%2 == 0){
                        Stone stone = new Stone(x,y,"W");
                        System.out.print(stone.getColor());
                    }else{
                        Stone stone = new Stone();
                        System.out.print(stone.getColor());
                    }
                    System.out.print(stone.getColor());}
                else{
                Stone stone = new Stone(x,y);
                this.board[y][x] = stone;
                System.out.print(stone.getColor());
            }
            }
        }



        /*Stone stone1 = new Stone(3,3,"W");
        Stone stone2 = new Stone(4,4,"W");
        Stone stone3 = new Stone(3,4,"B");
        Stone stone4 = new Stone(4,3,"B");
        board[3][3] = (stone1);
        putStone(stone2);
        putStone(stone3);
        putStone(stone4);**/
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
}