package program.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import program.model.combiAccountModel;

@Repository
public interface combiAccountRepository extends CrudRepository<combiAccountModel, Long> {
    Page<combiAccountModel> findById(Long id, Page page);
}
