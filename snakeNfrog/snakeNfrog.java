package snakeNfrog;

import javax.swing.JFrame;

public class snakeNfrog extends JFrame {
    snakeNfrog() {
        super("Snake n' Frog");
        add(new Board());
        
        setSize(300, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new snakeNfrog();
    }
}