/**
Mobile Phone Store
Create a class Mobile with fields: brand, model, price.
Use setters to set values. Create a method to check if phone is affordable (price < 20000).
 */


class Mobile {
    
    private String brand;
    private String model;
    private double price;

   
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAffordable() {
        return price < 20000;
    }

    public void displayDetails() {
        System.out.println("Mobile Brand : " + brand);
        System.out.println("Model        : " + model);
        System.out.println("Price        : ₹" + price);
        if (isAffordable()) {
            System.out.println("Status       : Affordable");
        } else {
            System.out.println("Status       : Not Affordable");
        }
    }
}


class Main {
    public static void main(String[] args) {
        Mobile phone = new Mobile();

        
        phone.setBrand("Samsung");
        phone.setModel("Galaxy M14");
        phone.setPrice(13999);

       
        phone.displayDetails();
    }
}
