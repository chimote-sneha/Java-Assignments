/**
Book Library
Create a class Book with fields: title, author, and price.
Use setters to assign values and a method to print book details.
 */

class Library{
    private String title;
    private String author;
    private int price;

  
    public void setLibraryDetails(String title , String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
       this.title = title;
    }

    public void setAuthor(String author) {
       this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author : " + author);
        System.out.println("Book Price: " + price);
    }
}
class Main {
    public static void main(String[] args) {
       Library lb = new Library();
        

       
        lb.setTitle("How To Be Alone");
        lb.setAuthor("Revati");
        lb.setPrice(250);
        lb.displayDetails();
    }
}

