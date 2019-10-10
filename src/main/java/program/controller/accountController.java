package program.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import program.model.accountModel;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/account")
public class accountController {

    @Autowired private program.service.accountService accountService;

    @GetMapping("{id}")
    public ResponseEntity getAccount(@PathParam("id") long id){
        accountModel account = accountService.findById(id);
        return ResponseEntity.ok(account);
    }

    @PostMapping("/creation")
    public accountModel addAccount(@Valid @RequestBody accountModel accountModel){
            //Persisting the user
            //return ResponseEntity.ok("Account is valid");
        return accountService.save()
        }
}
