package org.iesfm.library;


import org.iesfm.library.exceptions.BookNotFoundException;
import org.iesfm.library.exceptions.MemberNotFoundException;
import org.junit.Assert;
import org.junit.Test;

public class LibraryTest {

    private String[] genders = {"terror, fantasia, magia "};
    private String[] genders2 = {"Terror, rapidez"};

    private Book[] libros = {
            new Book("45645465g", "La bella durmiente", "Niche", genders),
            new Book("545465456s", "Don rapido", "Carlos Porras", genders2)
    };

    private Member[] members = {
            new Member("48465486q", "Pepe", "Viyuela", 3894751, 5846849),
            new Member("568644587f", "Javier", "Moragues", 8849456, 52584)
    };

    private Lend[] lends = {
            new Lend("45645465g", "22/1/2020", "568644587f", "22/1/2022"),
            new Lend("545465456s", "7/6/2019", "48465486q", "5/10/2020")
    };

    private Library library = new Library("Nombre", libros, members, lends);


    @Test
    public void getBookTest() {
        Book result = null;
        try {
            result = library.getBook("45645465g");
            Assert.assertEquals("La bella durmiente", result.getTitle());
        } catch (BookNotFoundException e) {
            Assert.fail();
        }


    }

    @Test
    public void getBookNotExistTest() {
        Book result = null;
        try {
            result = library.getBook("456455g");
            Assert.fail();
        } catch (BookNotFoundException e) {

        }
    }

    @Test
    public void getMember() {
        Member result = null;
        try {
            result = library.getMember("568644587f");
            Assert.assertEquals(8849456, result.getNumberMember());
        } catch (MemberNotFoundException e) {
            Assert.fail();
        }

    }


    @Test
    public void getNotFoundMember() {
        Member result = null;
        try {
            result = library.getMember("18685576p");
            Assert.fail();
        } catch (MemberNotFoundException e) {

        }
    }


    @Test

    public void getBookLend (){
        try {
            boolean resultMember=library.getBookLend("568644587f","45645465g");
            Assert.assertTrue(resultMember);
        }catch (MemberNotFoundException | BookNotFoundException e){
            Assert.fail();
        }
    }

    @Test
    public void getNotFoundLend(){
        try{
            boolean lend = library.getBookLend("8245624s", "45645465g");
            Assert.fail();
        } catch (MemberNotFoundException | BookNotFoundException e){
            System.out.println("Te has equivocado");
        }
    }
}

