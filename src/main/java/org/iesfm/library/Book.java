package org.iesfm.library;

import java.util.Arrays;
import java.util.Objects;

public class Book {
        private String isbn;
        private String title;
        private String author;
        private String [] genders;

    public Book(String isbn, String title, String author, String[] genders) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genders = genders;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getGenders() {
        return genders;
    }

    public void setGenders(String[] genders) {
        this.genders = genders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Arrays.equals(genders, book.genders);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(isbn, title, author);
        result = 31 * result + Arrays.hashCode(genders);
        return result;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genders=" + Arrays.toString(genders) +
                '}';
    }
}
