package io.codeforall.supernans;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.util.Arrays;

public class Handler implements KeyboardHandler {

    private Keyboard keyboard;

    Rectangle player;
    Cell[] cells = new Cell[100];
    Cell cell;


    public Handler(Rectangle player) {
        keyboard = new Keyboard(this);
        this.player = player;
        createKeyboardEvents();
    }

    public void createKeyboardEvents() {

        KeyboardEvent keyboardEventRight = new KeyboardEvent();
        keyboardEventRight.setKey(KeyboardEvent.KEY_RIGHT);
        keyboardEventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventRight);

        KeyboardEvent keyboardEventLeft = new KeyboardEvent();
        keyboardEventLeft.setKey(KeyboardEvent.KEY_LEFT);
        keyboardEventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventLeft);

        KeyboardEvent keyboardEventUp = new KeyboardEvent();
        keyboardEventUp.setKey(KeyboardEvent.KEY_UP);
        keyboardEventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventUp);

        KeyboardEvent keyboardEventDown = new KeyboardEvent();
        keyboardEventDown.setKey(KeyboardEvent.KEY_DOWN);
        keyboardEventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventDown);

        KeyboardEvent keyboardEventSpace = new KeyboardEvent();
        keyboardEventSpace.setKey(KeyboardEvent.KEY_SPACE);
        keyboardEventSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventSpace);

        KeyboardEvent keyboardEventEnter = new KeyboardEvent();
        keyboardEventEnter.setKey(KeyboardEvent.KEY_ENTER);
        keyboardEventEnter.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventEnter);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                player.translate(player.getWidth(), 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                player.translate(-player.getWidth(), 0);
                break;
            case KeyboardEvent.KEY_UP:
                player.translate(0, -player.getHeight());
                break;
            case KeyboardEvent.KEY_DOWN:
                player.translate(0, player.getHeight());
                break;
            case KeyboardEvent.KEY_SPACE:
                cell = new Cell(player.getX(), player.getY());
                cell.paint(Color.YELLOW);
                for (int i = 0; i < this.cells.length; i++) {
                    if (this.cells[i] == null) {
                        this.cells[i] = cell;
                        break;
                    }
                }
                break;
            case KeyboardEvent.KEY_ENTER:
                for (int i = 0; i < this.cells.length; i++) {
                    if(this.cells[i]!=null){
                        if (this.cells[i].playerIsHere(player)) {
                            this.cells[i].delete();
                       }
                    }
                }
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {


        }

    }
}
