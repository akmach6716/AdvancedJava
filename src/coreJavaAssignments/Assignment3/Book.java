package coreJavaAssignments.Assignment3;

public class Book {

    String isbn;
    String title;
    double price;

    Book(String isbn, String title, double price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class Novel extends Book {
    String author;

    Novel(  String  isbn, String title, double price, String author) {
        super(isbn, title, price);
        this.author = author;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Author: " + author);
    }
}

class Magazine extends Book {
    String type;

    Magazine(String isbn, String title, double price, String type) {
        super(isbn, title, price);
        this.type = type;
    }
}
