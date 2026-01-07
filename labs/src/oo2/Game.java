package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import  javax.swing.*;

public class Game extends Canvas{
    Shape[] shapes = {
            new Shape(50, 150, 10, 10, ShapeType.RECTANGLE),
            new Shape(100, 150, 10, 10, ShapeType.ROUNDRECTANGLE),
            new Shape(150, 150, 20, 20, ShapeType.OVAL),
            new Shape(200, 150, 10, 10, ShapeType.ARC),
            new Shape(250, 150, 30, 30, ShapeType.THREEDRECTANGLE)
    };

    Game() {
        JFrame frame = new JFrame();
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        Shape.setWorld(300, 300);

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
        for(Shape shape : shapes) {
            shape.move();
        }
        this.repaint();
    }

    public void paint(Graphics g) {
        g.drawRect(0, 0, Shape.worldW, Shape.worldH);
        for(Shape shape : shapes) {
            switch (shape.getShapeType()) {
                case RECTANGLE -> g.drawRect(shape.x, shape.y, shape.w, shape.h);
                case THREEDRECTANGLE -> g.draw3DRect(shape.x, shape.y, shape.w, shape.h, true);
                case ROUNDRECTANGLE -> g.drawRoundRect(shape.x, shape.y, shape.w, shape.h, (int) shape.w/4, (int) shape.h/4);
                case OVAL -> g.drawOval(shape.x, shape.y, shape.w, shape.h);
                case ARC -> g.drawArc(shape.x, shape.y, shape.w, shape.h, 0, 180);
            }
        }
    }
}
