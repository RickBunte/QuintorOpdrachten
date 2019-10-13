package program.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import program.model.accountModel;
import program.repository.accountRepository;

import java.util.List;

public interface accountService {
    accountModel findById(long id);
}

@Service
@CacheConfig(cacheNames = {"accounts"})
class DefaultAccountService implements accountService {
    private static final Logger log = LoggerFactory.getLogger(DefaultAccountService.class);

    @Cacheable
    @Override
    public accountModel findById(long id) {
        log.info("Trying to get account by id {}", id);
        return findById(id);

    }

    private accountModel getAccountInfo(final Long id){
        accountModel accountModel = new accountModel();
        accountModel.setId(id);
        accountModel.setAccountNumber("00000000");
        accountModel.setBalance(500);
        accountModel.setIban(accountModel.generateIban());
        return accountModel;
    }

    /*public List<accountModel> getAccountList(int page, int size){
        PageRequest pageReq = PageRequest.of(page, size);
        Page<accountModel> accounts = accountRepository.findById();
    }*/
}
