package abe.abe.service;

import abe.abe.model.Customer;
import abe.abe.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepo;

    public Customer addCustomer(Customer s){
        return customerRepo.save(s);
    }

    public List<Customer> getAll(){
        return customerRepo.findAll();
    }

    public Optional<Customer> findById(Long id){
        return customerRepo.findById(id);
    }

    public void deleteById(Long id){
        customerRepo.deleteById(id);
    }

}
