package com.example.library;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBookTitle() {
        return bookRepository.findBookTitle();
    }
}
