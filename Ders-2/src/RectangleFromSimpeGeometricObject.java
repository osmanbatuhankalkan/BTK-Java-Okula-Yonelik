public class RectangleFromSimpeGeometricObject extends CircleFromSimpleGeometricObject{
    private double widht;
    private double height;

    public RectangleFromSimpeGeometricObject(){}
    public RectangleFromSimpeGeometricObject(double widht,double height){
    this.widht = widht;
    this.height = height;
    }
    public RectangleFromSimpeGeometricObject(double widht,double height,String color,boolean filled){
        this.widht = widht;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    public double getWidht(){
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){this.height=height;}
    public double getArea(){
        return widht*height;
    }
    public double getPerimeter(){
        return 2*(widht+height);
    }
}
