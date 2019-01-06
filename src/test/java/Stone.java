import java.util.Scanner;
public class Stone {

    private int x;
    private int y;
    private String color;

    public Stone(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Stone(){
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

    public void reverse() {
    }

}
class PutStone{

    private int x;
    private int y;

    public PutStone(){
        Scanner position = new Scanner(System.in);
        x = position.nextInt();
        y = position.nextInt();
        this.x = x;
        this.y = y;
    }
    public int getPlaceX() {
        return x;
    }
    public int getPlaceY(){
        return y;

    }
}
