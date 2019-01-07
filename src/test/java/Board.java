import java.util.*;
public class Board {
   ArrayList<ArrayList<Stone>> board = new ArrayList<ArrayList<Stone>>();
   ArrayList<Stone> boardX = new ArrayList<>();
   public Board(){

        for(int y = 0; y < 8; y++){
            board.add(boardX);
            System.out.println();
            for(int x = 0; x < 8; x++){
                Stone stone = new Stone(x, y);
                boardX.add(stone);
                String color = stone.getColor();
                System.out.print(color);
            }
        }
    }

    public void putStone(){
       Stone stone = new Stone(3,3,"W");
       board.set(3,boardX.set(3,stone));

    }

    public ArrayList<ArrayList<Stone>> getBoard(){
       System.out.println(boardX);
       System.out.println(board);
        for(ArrayList<Stone> boardX : board){
            System.out.println();
            for(Stone stone : boardX){
                String color = stone.getColor();
                System.out.print(color);
            }

        }


        return this.board;
        }



        //tone = board.get(2).get(2);
        //System.out.println(stone.getColor());


    public void putStoneEffect(Stone stone){
        stone.getX();

    }

}
