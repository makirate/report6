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

    public void reverse(){

    }

}
