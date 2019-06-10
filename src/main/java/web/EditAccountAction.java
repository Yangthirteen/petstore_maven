package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import service.AccountService;

public class EditAccountAction extends ActionSupport {

    private String username;
    private Account account;
    private AccountService accountService;

    public EditAccountAction(){accountService=new AccountService();}

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String execute() throws Exception {
        accountService=new AccountService();
        account=accountService.getAccount(username);
        if (account==null)
            return ERROR;
        return SUCCESS;
    }
}
