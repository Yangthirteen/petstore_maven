package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import service.AccountService;

public class NewAccountAction extends ActionSupport {

    private Account account;
    private String username;
    private String password;
    private AccountService accountService;

    public NewAccountAction(){
        accountService=new AccountService();
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        account.setUsername(username);
        account.setPassword(password);
        accountService.insertAccount(account);

        return SUCCESS;
    }
}
