package program.service;

import org.springframework.stereotype.Component;
import program.DTO.accountDto;
import program.model.accountModel;

@Component
public class accountTransformer {
    public static accountDto toDto(accountModel accountModel){
        accountDto dto = new accountDto();

        dto.setId(accountModel.getId());
        dto.setAccountNumber(accountModel.getAccountNumber());
        dto.setBalance(accountModel.getBalance());
        dto.setIban(accountModel.getIban());

        return dto;
    }
}
