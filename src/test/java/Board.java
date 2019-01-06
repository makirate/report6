import java.util.*;
public class Board {
   List<Stone> board = new ArrayList<Stone>();
   Stone stone = new Stone();
    public Board(){
    }
    public void setBoard(){
        for(int y = 0; y < 8; y++){
            System.out.println();
            for(int x = 0; x < 8; x++){
                Stone stone = new Stone(x,y,"G");
                board.add(stone);
                String out = this.stone.getColor();
                System.out.print(out);
            }
        }
    }

}
