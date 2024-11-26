package com.gvp.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @GetMapping("/square/{num}")
    public int square(@PathVariable("num") int number){
        Square square = new Square();
        return square.findSquareOf(number);
    }
}
