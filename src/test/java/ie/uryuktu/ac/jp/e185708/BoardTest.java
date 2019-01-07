package ie.uryuktu.ac.jp.e185708;

public class BoardTest {
    Stone stone = new Stone();
    Stone[][] board = new Stone[8][8];
    public BoardTest(){
        for(int y = 0; y < 8; y++){
            System.out.println();
            for(int x = 0; x < 8; x++){
                Stone stone = new Stone(x,y);
                this.board[y][x] = stone;
                System.out.print(stone.getColor());
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
}