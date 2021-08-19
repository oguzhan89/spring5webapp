package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {

    @GetMapping(value = "/product")
    public void writeProduct() {
        System.out.println("Write Product Controlller");
    }
}
