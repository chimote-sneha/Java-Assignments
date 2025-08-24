/**
Rectangle Area Calculator
Create a class Rectangle with fields: length, width.
Use setters to assign values. Add a method to calculate area.
 */


class Rectangle {
    
    private double length;
    private double width;

    
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

   
    public void displayDetails() {
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Area   : " + getArea());
    }
}


class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

      
        rect.setLength(10.0);
        rect.setWidth(5.5);

        
        rect.displayDetails();
    }
}
