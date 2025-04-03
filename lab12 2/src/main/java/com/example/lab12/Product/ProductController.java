package com.example.lab12.Product;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
 @RequestMapping ("/ products ")
 public class ProductController {
 @Autowired
 private ProductRepository repository ;
 @PostMapping
 public Product createProduct (@RequestBody Product product
    ) {
         return repository . save ( product ) ;
         }

         @GetMapping
 public List< Product > getAllProducts () {
         return repository . findAll () ;
         }

         @GetMapping ("/{ id}")
 public Product getProductById ( @PathVariable Long id ) {
         return repository . findById ( id ) . orElseThrow (() ->
                 new RuntimeException ("Not_Found ") ) ;
         }
 }