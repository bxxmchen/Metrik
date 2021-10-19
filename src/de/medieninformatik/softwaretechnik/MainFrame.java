package de.medieninformatik.softwaretechnik;

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
     */
    public MainFrame(){
        setSize(850, 550);
        setVisible(true);
        setTitle("Version 1.0.1");

        addWindowListener(mainFrameController);
        add(customCanvas);
        customCanvas.addMouseListener(canvasController);

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

