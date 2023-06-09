package main;
import javax.swing.JFrame;

public class GameWindow(GamePanel gamePanel) {
  private JFrame jframe;
  public GameWindow(){
    jframe=new JFrame();
    jframe.setSize(400,400);
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jframe.add( gamePanel);
    jframe.setVisible(true);  
  }
  
}