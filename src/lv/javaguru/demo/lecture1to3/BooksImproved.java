package lv.javaguru.demo.lecture1to3;

public class BooksImproved {

    public static void main(String[] args) {
        Books books = new Books();

        books.setAuthor("Baiba");
        System.out.println("Author: " + books.getAuthor());

        books.setYearPublished(2023);
        System.out.println("Year: " + books.getYearPublished());

        books.setBookName("Par pūķiem");
        System.out.println("Book name: " + books.getBookName());


        books.setISBN(123456789);
        System.out.println("ISBN: " + books.getISBN());

    }
}