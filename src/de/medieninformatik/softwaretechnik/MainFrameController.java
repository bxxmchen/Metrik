package de.medieninformatik.softwaretechnik;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author Carolin Baum, m29137
 * @author Noah Darwin Hakkenbrock, m29276
 * date: 19.10.2021
 *
 * The class MainFrameController is for closing the window.
 */

public class MainFrameController implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    /**
     * The method windowClosing is for closing the window.
     * @param e event
     */
    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
