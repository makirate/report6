import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Stone extends ArrayList<Stone> {

    private int x;
    private int y;
    private String color;

    public Stone(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public Stone(){
        //this.color = "G";
    }

    public Stone(int x, int y){
        this.x = x;
        this.y = y;
        this.color = "G";
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String getColor(){
        return color;
    }

    @Override
    public Stream<Stone> stream() {
        return null;
    }
}
class PutStone {
    int x;
    int y;
    String color;

    public PutStone(String color) {
        Scanner position = new Scanner(System.in);
        x = position.nextInt();
        y = position.nextInt();
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Stone getDate() {
        Stone stone = new Stone(this.x, this.y, this.color);
        return stone;
    }

    public void reverse() {
        if (color.equals("W")) {

        } else {

        }


    }

}
