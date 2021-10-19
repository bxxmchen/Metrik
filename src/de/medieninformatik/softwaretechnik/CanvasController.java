package de.medieninformatik.softwaretechnik;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;

/**
 * @author Carolin Baum, m29137
 * @author Noah Darwin Hakkenbrock, m29276
 * date: 19.10.2021
 *
 * The class CanvasController draws the squares after the mouse was clicked.
 */

public class CanvasController implements MouseListener {

    int x1, x2, y1, y2;
    int counter = 0;
    Canvas canvas;

    /**
     * The method mouseClicked counts the amount of mouse clicks and draws the squares.
     * @param e event
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        canvas = (Canvas) e.getSource();
        Graphics g = canvas.getGraphics();
        Rectangle2D rectangle2D;
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.ORANGE);

        //in case of a double click
        if (e.getClickCount()==2){

            //counts the quantity of double clicks
            switch (counter){
                //first click, first square
                case 0:
                    x1 = e.getX();
                    y1 = e.getY();
                    rectangle2D = new Rectangle2D.Float(x1-20.0F, y1-20.0F, 40.0F, 40.0F);
                    g2d.fill(rectangle2D);
                    counter++;
                    break;
                //second click, second square
                case 1:
                    x2 = e.getX();
                    y2 = e.getY();
                    rectangle2D = new Rectangle2D.Float(x2-20.0F, y2-20.0F, 40.0F, 40.0F);
                    g2d.fill(rectangle2D);
                    counter++;
                    break;
                //third click, clear canvas
                case 2:
                    repaint();
                    counter = 0;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     * The method repaint is for repainting the canvas.
     */
    public void repaint(){
        canvas.repaint();
    }

}
