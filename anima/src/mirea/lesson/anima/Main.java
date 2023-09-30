package mirea.lesson.anima;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        var cwd = System.getProperty("user.dir");
        JFrame window = new JFrame("Anima");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.RED);
        ImageIcon img = new ImageIcon(args[0]);
        Panel pnl = new Panel();
        pnl.add(new JLabel(img));
        window.add(pnl);
        window.setSize(230, 371);
        window.setVisible(true);
    }
}
