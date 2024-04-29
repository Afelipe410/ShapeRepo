public class Circle extends Shape {
    private int radius = 0;

    public Circle(int newradius) {
        setRadius(newradius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        radius = newRadius;
    }
    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }
    
    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}