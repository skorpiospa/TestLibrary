package org.iesfm.library;

import java.util.Objects;

public class Lend {

    private String isbn;
    private String dateLend;
    private String nifMember;
    private String returnLend;

    public Lend(String isbn, String dateLend, String nifMember, String returnLend) {
        this.isbn = isbn;
        this.dateLend = dateLend;
        this.nifMember = nifMember;
        this.returnLend = returnLend;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDateLend() {
        return dateLend;
    }

    public void setDateLend(String dateLend) {
        this.dateLend = dateLend;
    }

    public String getNifMember() {
        return nifMember;
    }

    public void setNifMember(String nifMember) {
        this.nifMember = nifMember;
    }

    public String getReturnLend() {
        return returnLend;
    }

    public void setReturnLend(String returnLend) {
        this.returnLend = returnLend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lend lend = (Lend) o;
        return Objects.equals(isbn, lend.isbn) && Objects.equals(dateLend, lend.dateLend) && Objects.equals(nifMember, lend.nifMember) && Objects.equals(returnLend, lend.returnLend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, dateLend, nifMember, returnLend);
    }

    @Override
    public String toString() {
        return "org.iesfm.library.Lend{" +
                "isbn='" + isbn + '\'' +
                ", dateLend='" + dateLend + '\'' +
                ", nifMember='" + nifMember + '\'' +
                ", returnLend='" + returnLend + '\'' +
                '}';
    }
}
