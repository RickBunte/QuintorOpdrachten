package program.repository;

import org.springframework.data.repository.CrudRepository;
import program.model.accountModel;

public interface accountRepository extends CrudRepository<accountModel, Long>{
    accountModel findById(long id);
}

