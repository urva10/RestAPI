package com.urvashi.restAPI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @PostMapping("/product")
    public String saveProduct(@RequestBody Product p){
        System.out.println(p);
        return "Product Saved";
    }

    @GetMapping("/product/{pid}")
    public Product getProduct(@PathVariable Integer pid){
        Product p=null;
        if(pid==100) {
             p = new Product(100, "Mouse", 500.00);
        }else if(pid==101){
             p = new Product(101, "Keyboard", 1500.00);
        }
        return p;

    }

    @GetMapping("/products")
    public List<Product> getProducts(){

        Product p1 = new Product(100, "Mouse", 500.00);
        Product p2 = new Product(101, "Keyboard", 1500.00);

        List<Product> products= Arrays.asList(p1,p2);
        return products;
    }
}
