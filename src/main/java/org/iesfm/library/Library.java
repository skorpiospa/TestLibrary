package org.iesfm.library;

import org.iesfm.library.exceptions.BookNotFoundException;
import org.iesfm.library.exceptions.MemberNotFoundException;

import java.util.Arrays;
import java.util.Objects;

public class Library implements iLibrary {

    private String name;
    private Book[] books;
    private Member[] members;
    private Lend [] lends;

    public Library(String name, Book[] books, Member[] members, Lend[] lends) {
        this.name = name;
        this.books = books;
        this.members = members;
        this.lends = lends;
    }

    @Override
    public Book getBook(String askIsbn) throws BookNotFoundException {
       Book result=null;
       for (Book book:books){
           if (book.getIsbn().equals(askIsbn)){
               result=book;
           }
       }
       if (result==null){
           throw new BookNotFoundException();
       }
       return result;
    }

    @Override
    public Member getMember(String nif) throws MemberNotFoundException {
        Member result=null;
        for (Member member:members){
            if (member.getNif().equals(nif)){
                result=member;
            }
        }
        if (result==null){
            throw new MemberNotFoundException();
        }
        return result;
    }

    @Override
    public boolean getBookLend(String nif, String isbn) throws BookNotFoundException, MemberNotFoundException {
        Member resultMember=getMember(nif);
        Book resultBook=getBook(isbn);
        for (Lend lend:lends){
            if (lend.getIsbn().equals(resultBook.getIsbn())&&lend.getNifMember().equals(resultMember.getNif())){
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public Lend[] getLends() {
        return lends;
    }

    public void setLends(Lend[] lends) {
        this.lends = lends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Arrays.equals(books, library.books) && Arrays.equals(members, library.members) && Arrays.equals(lends, library.lends);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(books);
        result = 31 * result + Arrays.hashCode(members);
        result = 31 * result + Arrays.hashCode(lends);
        return result;
    }

    @Override
    public String toString() {
        return "org.iesfm.library.Library{" +
                "name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                ", members=" + Arrays.toString(members) +
                ", lends=" + Arrays.toString(lends) +
                '}';
    }

}
