package io.codeforall.supernans;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private int width = 40;
    private int height = 40;
    private Rectangle rectangle;
    private boolean isDeleted;


    public Cell(int x, int y){
        this.rectangle = new Rectangle(x,y,width,height);
    }

    public void paint(Color color){
        this.rectangle.setColor(color);
        this.rectangle.fill();
        this.isDeleted = false;
    }

    public boolean playerIsHere(Rectangle player){
        if (player.getX() == this.rectangle.getX() && player.getY() == this.rectangle.getY()){
            return true;
        }
        return false;
    }

    public int[] getPosition(){
        return new int[]{this.rectangle.getX(), this.rectangle.getY()};
    }

    public void delete(){
        this.rectangle.delete();
        this.isDeleted = true;
    }




}
