public class Square extends Shape {
    private int width = 0;
    
    public Square(int newWidth){
        setWidth(newWidth);
    }
    
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return  width;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    
    }
    public void setHeight(int newHeight){
        width = newHeight;
        
    }
    @Override
    public float getArea() {
        return getHeight() * getWidth();
    }
    @Override
    public float getPerimeter() {
        return 2*(getArea()+ getWidth());
    }
}