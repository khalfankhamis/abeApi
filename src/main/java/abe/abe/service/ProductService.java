package abe.abe.service;

import abe.abe.model.Product;
import abe.abe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    
    private ProductRepository productRepo;
    public Product addProduct(Product s){
        return productRepo.save(s);
    }

    public List<Product> getAll(){
        return productRepo.findAll();
    }

    public Optional<Product> findById(Long id){
        return productRepo.findById(id);
    }

    public void deleteById(Long id){
        productRepo.deleteById(id);
    }
}
