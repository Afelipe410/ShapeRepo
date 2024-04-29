public abstract class Shape {
    private int x = 0;
    private int y = 0;

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int newY) {
        y = newY;

    }

    public void setX(int newX) {
        x = newX;

    }

    public abstract float getArea();

    public abstract float getPerimeter();

}