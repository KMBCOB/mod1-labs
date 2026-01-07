package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import  javax.swing.*;

public class Game extends Canvas{
    Ball[] balls = {new Ball(50, 150, 10, 10), new Ball(150, 150, 20, 20), new Ball(50, 250, 30, 30)};

    Game() {
        JFrame frame = new JFrame();
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        Ball.setWorld(300, 300);

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };

        t.schedule(tt, 0, 55);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
            }
        });



    }

    public void draw() {
        for(Ball ball : balls) {
            ball.move();
        }
        this.repaint();
    }

    public void paint(Graphics g) {
        g.drawRect(0, 0, Ball.worldW, Ball.worldH);
        for(Ball ball : balls) {
            g.drawOval(ball.x, ball.y, ball.w, ball.h);
        }
    }
}
