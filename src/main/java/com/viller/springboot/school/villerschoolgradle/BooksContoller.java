package com.viller.springboot.school.villerschoolgradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksContoller {
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList((new Book(1, "Viller's adventures", "Viller")));
    }
}
