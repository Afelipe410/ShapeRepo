public class Triangle extends Shape {

    private int sides[] = new int[] { 0, 0, 0 };

    public Triangle(int side1, int side2, int side3) {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public int getSide1() {
        return sides[0];
    }

    public void setSide1(int newSize) {
        sides[0] = newSize;
    }

    public int getSide2() {
        return sides[1];
    }

    public void setSide2(int newSize) {
        sides[1] = newSize;
    }

    public int getSide3() {
        return sides[2];
    }

    public void setSide3(int newSize) {
        sides[2] = newSize;
    }

    @Override
    public float getArea() {
        double semiPe = (sides[0] + sides[1] + sides[2]) / 2.0;
        return (float) Math.sqrt(semiPe * (semiPe - sides[0]) * (semiPe - sides[1]) * (semiPe - sides[2]));
    }

    @Override
    public float getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }

}
