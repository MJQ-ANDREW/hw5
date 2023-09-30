package mirea.javaLessons.practical5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int milan = 0, real = 0;
    static boolean end = false;

    public static void main(String[] args) {
        JFrame window = new JFrame("Game");
        JButton goalMilan = new JButton("AC Milan");
        JButton goalReal = new JButton("Real Madrid");
        JButton endGame = new JButton("End Game");
        JLabel check = new JLabel("0 X 0");
        JLabel lastScorer = new JLabel("Last Scorer: Nobody");
        JLabel winner = new JLabel("WINNER: NOBODY");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        goalMilan.setBounds(150, 275, 125, 40);
        goalReal.setBounds(425, 275, 125, 40);
        check.setBounds(212, 110, 450, 100);
        endGame.setBounds(297, 340, 100, 20);
        lastScorer.setBounds(250, 180, 400, 150);
        winner.setBounds(230, 0, 400, 150);
        check.setFont(new Font("EuropeExt", Font.PLAIN, 82));
        goalMilan.setFont(new Font("Calibri", Font.PLAIN, 16));
        goalReal.setFont(new Font("Calibri", Font.PLAIN, 16));
        endGame.setFont(new Font("Calibri", Font.PLAIN, 12));
        lastScorer.setFont(new Font("EuropeExt", Font.PLAIN, 18));
        winner.setFont(new Font("EuropeExt", Font.PLAIN, 22));

        window.add(goalMilan);
        window.add(goalReal);
        window.add(check);
        window.add(endGame);
        window.add(lastScorer);
        window.add(winner);

        goalMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (end) {
                    return;
                }
                milan++;
                check.setText(milan + " X " + real);
                lastScorer.setText("Last Scorer: AC Milan");
                if (milan >= 10) {
                    check.setBounds(138, 60, 450, 100);
                }
            }
        });
        goalReal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (end) {
                    return;
                }
                real++;
                lastScorer.setText("Last Scorer: Real Madrid");
                check.setText(milan + " X " + real);
            }
        });
        endGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                end = true;
                if (milan > real) {
                    winner.setText("WINNER: AC MILAN");
                } else if (real > milan) {
                    winner.setText("WINNER: REAL MADRID");
                } else {
                    winner.setText("WINNER: DRAW");
                }
            }
        });

        window.setSize(700, 400);
        window.setLayout(null);
        window.setVisible(true);
    }
}
