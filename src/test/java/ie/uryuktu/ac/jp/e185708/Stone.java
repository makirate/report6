package ie.uryuktu.ac.jp.e185708;

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

    public Stone(String color){
        this.color = color;

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
    public void setColor(){
        this.color =  color ;
    }

    @Override
    public Stream<Stone> stream() {
        return null;
    }



    public Stone getDate(String color) {
        Scanner data = new Scanner(System.in);
        int x = data.nextInt()-1;
        int y = data.nextInt()-1;
        Stone stone = new Stone(x, y, color);
        return stone;
    }

    public void reverse() {
        if (color.equals("W")) {

        } else {

        }


    }

}
