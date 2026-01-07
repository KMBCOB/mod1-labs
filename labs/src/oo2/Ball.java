package oo2;

public class Ball {
    static int worldW;
    static int worldH;

    public int x, y, w, h;
    private int dirX, dirY;

    public Ball(int x, int y, int w, int h, int dirX, int dirY) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirX = dirX;
        this.dirY = dirY;
    }

    public Ball(int x, int y, int w, int h) {
        this(x, y, w, h, 1, 1);
    }

    public static void setWorld(int w, int h) {
        worldW = w;
        worldH = h;
    }

    void move() {
        x += dirX;
        y += dirY;
        if (x < 0) {
            x = 0;
            dirX = -dirX;
        }
        else if (x > worldW - w) {
            x = worldW - w;
            dirX = -dirX;
        }
        if (y < 0) {
            y = 0;
            dirY = -dirY;
        }
        else if (y > worldH - h) {
            y = worldH - h;
            dirY = -dirY;
        }
    }
}
