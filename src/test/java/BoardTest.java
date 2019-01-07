public class BoardTest {
    Stone[][] board ;
    public BoardTest(){
        for(int y = 0; y < 8; y++){
            System.out.println();
            for(int x = 0; x < 8; x++){
                Stone stone = new Stone(x,y);
                board[y][x] = stone;
                System.out.print(stone.getColor());
            }
        }
    }
}