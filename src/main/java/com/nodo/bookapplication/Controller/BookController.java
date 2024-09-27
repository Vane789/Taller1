package com.nodo.bookapplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.nodo.bookapplication.Model.Book;

@Controller

@RequestMapping("/book")
public class BookController {

    @GetMapping("/{title}/{author}/{year}")
    public String getBook(@PathVariable String title, @PathVariable String author, @PathVariable int year,
                          Model model){

        Book book = new Book(title, author, year);
        model.addAttribute("book", book);
        return "book";
    }
}
