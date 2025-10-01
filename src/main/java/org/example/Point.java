package org.example;


public class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter ve Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // 1️⃣ distance() → (0,0)'a uzaklık
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // 2️⃣ distance(int a, int b) → (a,b)'ye uzaklık
    public double distance(int a, int b) {
        return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
    }

    // 3️⃣ distance(Point p) → başka bir Point nesnesine uzaklık
    public double distance(Point p) {
        return Math.sqrt((p.getX() - x) * (p.getX() - x) + (p.getY() - y) * (p.getY() - y));
    }
}
