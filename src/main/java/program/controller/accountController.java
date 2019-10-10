package program.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import program.DTO.accountDto;
import program.model.accountModel;
import program.service.accountService;
import program.service.accountTransformer;

//import program.view.accountView;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/account")
public class accountController {

    @Autowired private program.service.accountService accountService;

    @GetMapping("{id}")
    public ResponseEntity getAccount(@PathParam("id") long id){
        accountModel account = accountService.findById(id);
        accountDto dto = accountTransformer.toDto(account);
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/creation")
    ResponseEntity<String> addAccount(@Valid @RequestBody accountModel accountModel){
            //Persisting the user
            return ResponseEntity.ok("Account is valid");
        }
    }

    /*private account account;
    private accountView accountView;

    public accountController(account account, accountView accountView){
        this.account = account;
        this.accountView = accountView;

        this.accountView.addListener(new AccountListener());
    }

    class AccountListener implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            String generatedIban = "";
            accountView.setResultingIban(account.generateIban());
        }
    }*/
