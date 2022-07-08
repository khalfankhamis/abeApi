package abe.abe.controller;

import abe.abe.model.Product;
import abe.abe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product s){
        return productService.addProduct(s);
    }

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable Long id){
        return productService.findById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product s,@PathVariable Long id){
        s.setId(id);
        return productService.addProduct(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        productService.deleteById(id);
    }
}
