/**Design a simple Library Management System using classes with the following:

A Book class with fields: id, title, author.

A Library class with methods:

addBook(Book b)

listBooks()

deleteBook(int id)

Write a program to:

Add 3 books.

List all books.

Delete a book by id and display remaining books. */

import java.util.ArrayList;
class Book {
   int id;
   private String title;
   private String author;

     public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    
    public void display() {
        System.out.println(" Book ID: " + id);
        System.out.println("Bokk Title : " + title);
        System.out.println("Book Author : " + author);
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

     public void addBook(Book b) {
        books.add(b);
    }

 
   public void listBooks() {
     for (Book b : books) {
                b.display();
            }
        }

   public void deleteBook(int id) {
        Book toRemove = null;
        for (Book b : books) {
            if (b.id == id) {
                toRemove = b;
                break;
            }
        }
        if (toRemove != null) {
            books.remove(toRemove);
            System.out.println("Book with ID " + id + " deleted.");
        } else {
            System.out.println("Book with ID " + id + " not found.");
        }
    }
}


 class Main {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook(new Book(101, "The Truth", "reena sharma"));
        l.addBook(new Book(102, "Mystry", "jantar sigh"));
        l.addBook(new Book(103, "Karma", "Sadhguru"));

        System.out.println("-------------------------------------------");
        System.out.println("Book Details :");
        l.listBooks();
        System.out.println("Deleting book ");
        l.deleteBook(102);
        System.out.println("Remaining Books :");
        l.listBooks();
    }
}
