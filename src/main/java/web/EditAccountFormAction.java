package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import service.AccountService;

public class EditAccountFormAction extends ActionSupport {
    private AccountService accountService;
    Account account;

    public EditAccountFormAction(){
        accountService=new AccountService();
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String execute() throws Exception {
        accountService.updateAccount(account);
        return SUCCESS;
    }
}
