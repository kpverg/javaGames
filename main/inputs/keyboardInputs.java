package main.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class keyboardInputs implements KeyListener {
    private GamePanel gamePanel;

    public keyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.changeZDelta(-5);
                break;
            case KeyEvent.VK_A:
                gamePanel.changeXDelta(-5);
                break;
            case KeyEvent.VK_D:
                gamePanel.changeXDelta(5);
                break;
            case KeyEvent.VK_S:
                gamePanel.changeZDelta(5);
                break;
        }
        // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'keyReleased'");
    }

    @Override
    public void keyTyped(KeyEvent e) {

        // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
}
