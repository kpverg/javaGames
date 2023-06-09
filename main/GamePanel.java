package main;

import javax.swing.JPanel;

import main.inputs.keyboardInputs;
import main.inputs.mouseInputs;

import java.awt.Graphics;

public class GamePanel extends JPanel {
  private mouseInputs mouseInputs;
  int xdelta = 100, zdelta = 100;
  private int fps = 0;
  private long lastCheck = 0;

  public GamePanel() {

    mouseInputs = new mouseInputs(this);
    addKeyListener(new keyboardInputs(this));
    addMouseListener(mouseInputs);
    addMouseMotionListener(mouseInputs);

  }

  public void setRectPos(int x, int z) {
    this.xdelta = x;
    this.zdelta = z;
    // repaint();

  }

  public void changeXDelta(int value) {
    this.xdelta += value;
    // repaint();
  }

  public void changeZDelta(int value) {
    this.zdelta += value;
    // repaint();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.fps++;
    if (System.currentTimeMillis() - lastCheck >= 1000) {
      lastCheck = System.currentTimeMillis();
      this.fps = 0;
    }

    g.fillRect(xdelta, zdelta, 200, 50);
    repaint();
    System.out.println("fps: " + fps);
  }

}
