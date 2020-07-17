package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book("The book title", "The book author", 2000);
        bookList.add(book);
        return bookList;
    }

    public List<LibraryUser> listBooksInHandsOf(LibraryUser libraryUser) {
        List<LibraryUser> userList = new ArrayList<>();
        LibraryUser libraryUser1 = new LibraryUser("First Name", "Last Name", "Pesel ID");
        userList.add(libraryUser1);
        return userList;
    }
}
