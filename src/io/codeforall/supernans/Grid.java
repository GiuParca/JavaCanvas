package io.codeforall.supernans;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {
    int rows = 20;
    int cols = 20;
    int height = 800;
    int width = 800;
    Rectangle rectangle = new Rectangle(10, 10, 800, 800);


    public Grid() {
        rectangle.draw();
        int drawingCols = width/cols;
        for (int i= 0; i < cols; i++){
            int drawingRows = height/rows;
            for (int j=0; j<rows; j++) {
                Rectangle drawingRectangles = new Rectangle(10 + i * drawingCols, 10 + j*drawingRows, 40, 40);
                drawingRectangles.draw();
            }
        }
    }
}
