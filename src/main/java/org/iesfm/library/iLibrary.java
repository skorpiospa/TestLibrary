package org.iesfm.library;

import org.iesfm.library.exceptions.BookNotFoundException;
import org.iesfm.library.exceptions.MemberNotFoundException;

public interface iLibrary {

    public Book getBook (String askIsbn) throws BookNotFoundException;

    public Member getMember (String nif) throws MemberNotFoundException;

    public boolean getBookLend (String nif, String askIsbn) throws BookNotFoundException, MemberNotFoundException;
}
