package program.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import program.model.accountModel;

@Repository
public interface accountRepository extends CrudRepository<accountModel, Long>{
    accountModel findById(long id);
}

