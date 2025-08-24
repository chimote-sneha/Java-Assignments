/**
Car Info Manager
Create a class Car with fields: brand, model, and year.
Use setters to assign values. Create a method to print full car info.
 */

class CarInfo{

    private String model;
    private String brand;
    private int year;

  
    public void setCarDetails(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
       this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Model   : " + model);
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Year: " + year);
    }
}

class Main {
    public static void main(String[] args) {
        CarInfo ci = new CarInfo();

       
        ci.setModel("20Az7");
        ci.setBrand("John Doe");
        ci.setYear(1955);

        ci.displayDetails();
    }
}