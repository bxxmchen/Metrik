package de.medieninformatik.softwaretechnik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Carolin Baum, m29137
 * @author Noah Darwin Hakkenbrock, m29276
 * date: 19.10.2021
 *
 * The class MainFrame is responsible for the frame of the application.
 */

public class MainFrame extends Frame implements ActionListener{

    MainFrameController mainFrameController = new MainFrameController();
    CanvasController canvasController = new CanvasController();
    CustomCanvas customCanvas = new CustomCanvas();

    /**
     * The constructor of the class MainFrame sets the size, the title and the visibility.
     * Furthermore it is responsible for the menu for the background color.
     */
    public MainFrame(){
        setSize(850, 550);
        setVisible(true);
        setTitle("Version 1.1");

        addWindowListener(mainFrameController);
        add(customCanvas);
        customCanvas.addMouseListener(canvasController);

        MenuBar bar = new MenuBar();
        Menu menuHg = new Menu("Hintergrund");

        MenuItem bgWhite = new MenuItem("Weiß");
        //background color changes to white
        bgWhite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customCanvas.changeBackground(Color.WHITE);
            }
        });
        MenuItem bgDarkgray = new MenuItem("Dunkelgrau");
        //background color changes to dark gray
        bgDarkgray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customCanvas.changeBackground(Color.DARK_GRAY);
            }
        });
        MenuItem bgBlack = new MenuItem("Schwarz");
        //background color changes to black
        bgBlack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customCanvas.changeBackground(Color.BLACK);
            }
        });
        menuHg.add(bgWhite);
        menuHg.add(bgDarkgray);
        menuHg.add(bgBlack);
        bar.add(menuHg);
        setMenuBar(bar);

    }

    /**
     * The method actionPerformed calls the method repaint up.
     * @param e event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        canvasController.repaint();
    }
}

