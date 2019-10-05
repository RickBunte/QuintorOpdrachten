package program.service;

import org.springframework.data.repository.CrudRepository;
import program.model.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    List<Employee> findByLastName(String lastName);
    Employee findById(long id);
}