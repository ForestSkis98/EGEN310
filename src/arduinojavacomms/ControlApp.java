package arduinojavacomms;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class ControlApp extends JPanel {
    private int speed;

    public ControlApp() {
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EGEN Control App");
        ControlApp keyboardExample = new ControlApp();
        frame.add(keyboardExample);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
            switch (KeyEvent.getKeyText(e.getKeyCode())) {
                case "Q":
                    System.out.println("Left forward");
                    break;
                case "E":
                    System.out.println("Right forward");
                    break;
                case "A":
                    System.out.println("Left backward");
                    break;
                case "D":
                    System.out.println("Right backward");
                    break;
                case "W":
                    System.out.println("Both forward");
                    break;
                case "S":
                    System.out.println("Both backward");
                    break;
                default:
                    try {
                        speed = Integer.parseInt(KeyEvent.getKeyText(e.getKeyCode()));
                    } catch (Exception exception) {

                    }
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
            switch(KeyEvent.getKeyText(e.getKeyCode())) {
                case "Q":
                    System.out.println("Stop left forward");
                    break;
                case "E":
                    System.out.println("Stop right forward");
                    break;
                case "A":
                    System.out.println("Stop left backward");
                    break;
                case "D":
                    System.out.println("Stop right backward");
                    break;
                case "W":
                    System.out.println("Stop both forward");
                    break;
                case "S":
                    System.out.println("Stop both backward");
                    break;
                default:
                    break;
            }
        }
    }
}
