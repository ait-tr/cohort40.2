package l28;

import java.util.ArrayList;
import java.util.List;

class BookShelf {
    private List<Book> books = new ArrayList<>();

    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return title + " by " + author + ", " + year;
        }
    }

    void addBook(String title, String author, int year) {
        books.add(new Book(title, author, year));
    }

    // Методы removeBook и toString опущены для краткости
}
