package Main;

import javax.swing.*;

public class SnakeGame extends JFrame{

    public SnakeGame() {
        this.add(new Graphics());
        this.setTitle("Snake Game");
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
