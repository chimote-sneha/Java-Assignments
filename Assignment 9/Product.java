/**
Product Inventory
Create a class Product with fields: productId, name, quantity, price.
Use setters to assign values. Add a method to calculate total value (quantity * price).
 */

class Product{

    private int pid;
    private String pname;
    private int pquantity;
    private int price;

  
    public void setProductDetails(int pid, String pname, int pquantity, int price) {
        this.pid = pid;
        this.pname = pname;
        this.pquantity = pquantity;
        this.price = price;
    }

    public void setId(int pid) {
        this.pid = pid;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public void setQuantity(int pquantity) {
        this.pquantity = pquantity;
    }

    public void setPrice(int price){
        this.price = price;

    }

    public void displayDetails() {
        System.out.println("Product ID   : " + pid);
        System.out.println("Product Name : " + pname);
        System.out.println("Product Quantity: " +   pquantity);
        System.out.println("Product Price : " + price);
    } 
}

class Main{
    public static void main(String args[]){
        Product pt = new Product();
        pt.setId(567);
        pt.setName("XYZ");
        pt.setQuantity(4);
        pt.setPrice(1400);
        pt.displayDetails();
    }
}