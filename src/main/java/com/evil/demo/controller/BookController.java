package com.evil.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/books")
public class BookController {

	
	    @GetMapping(value = "/{id}", produces = "application/json")
	    public @ResponseBody Integer getBook(@PathVariable int id) {
	        return findBookById(id);
	    }

	    private Integer findBookById(int id) {
	        return id;
	    }
}