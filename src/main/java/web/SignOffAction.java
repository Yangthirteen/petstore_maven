package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import service.AccountService;

public class SignOffAction extends ActionSupport {
    private AccountService accountService;
    private Account account;

    public SignOffAction() {
        accountService = new AccountService();
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String execute() throws Exception {
        account=null;
        return SUCCESS;
    }
}
