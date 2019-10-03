package program.service;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import program.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
    List<Customer> findByLastName(String lastName);
    Customer findById(long id);
}