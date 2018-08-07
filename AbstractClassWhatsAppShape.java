abstract class Shape
{
  protected   String color;
   protected boolean filled;

   Shape()
   {
       
   }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
   
    
    abstract double getArea();
    
    abstract double getPerimeter();
    
    public String toString()
    {
        return "a";
    }
            
    
   
    
}

class Circle extends Shape
{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    double getArea()
    {
        return 4;
    }
    
    double getPerimeter()
    {
        return 4;
    }
    
    
}

class Rectangle extends Shape
{
    double width;
    double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
     double getArea()
    {
        return 4;
    }
    
    double getPerimeter()
    {
        return 4;
    }
    
    
}

public class AbstractClassWhatsAppShape {
    
    Shape s= new Circle();
    
    
}
