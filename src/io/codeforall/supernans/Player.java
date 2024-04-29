package io.codeforall.supernans;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class Player {
    Rectangle player;
    private int width = 40;
    private int height = 40;

    public Player(){
        player = new Rectangle(10, 10, width, height);
        player.setColor(Color.BLUE);
        player.fill();
        new Handler(player);
    }
    }



