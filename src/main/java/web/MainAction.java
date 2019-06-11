package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import service.AccountService;
import service.CatelogService;

public class MainAction extends ActionSupport {

    private Account account;
    private CatelogService catelogService;
    private AccountService accountService;

    public MainAction(){
        catelogService=new CatelogService();
        accountService=new AccountService();
    }

    @Override
    public String execute() throws Exception {
        if (account!=null)
            account=accountService.getAccount(account.getUsername());
        return SUCCESS;
    }
}
