package com.library.librarymanagement;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public String getBookInfo() {
        return "Spring in Action - Craig Walls";
    }
}
