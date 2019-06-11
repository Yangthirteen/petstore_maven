package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import service.AccountService;

public class SignOnFormAction extends ActionSupport {

    private AccountService accountService;
    private Account account;

    public SignOnFormAction(){accountService=new AccountService();}

    @Override
    public String execute() throws Exception {
        if (account!=null)
            account=accountService.getAccount(account.getUsername());
        return SUCCESS;
    }
}
