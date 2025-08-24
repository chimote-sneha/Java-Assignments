/**
Circle Geometry
Create a class Circle with field radius.
Use a setter to assign radius. Add methods to compute area and circumference.
 */


class Circle {
    
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

  
    public void displayDetails() {
        System.out.println("Radius          : " + radius);
        System.out.println("Area            : " + getArea());
        System.out.println("Circumference   : " + getCircumference());
    }
}


class Main {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.setRadius(7.5);

        
        c.displayDetails();
    }
}
