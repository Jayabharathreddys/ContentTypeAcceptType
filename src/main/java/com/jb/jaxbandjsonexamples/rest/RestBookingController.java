package com.jb.jaxbandjsonexamples.rest;

import com.jb.jaxbandjsonexamples.bindings.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RestBookingController {

    @PostMapping(value = "/addBook",
    consumes = {"application/json", "application/xml"},
    produces = "text/plain")
    public String addBook(@RequestBody Book b){
        System.out.println(b);

        return "added book";
    }
    @GetMapping(value = "/book",produces = {"application/json","application/xml"})
    public Book getBook(){
        return new Book(123, "Good Habits", 521.00);
    }
}
