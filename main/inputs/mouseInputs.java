package main.inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class mouseInputs implements MouseListener, MouseMotionListener {
    private GamePanel gamePanel;

    public mouseInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouse dragging");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseDragged'");
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        gamePanel.setRectPos(e.getX(), e.getY()); // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("mouse Clicked");// TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseClicked'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseExited'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseReleased'");
    }

}
