package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Item;
import service.AccountService;
import service.CatelogService;

public class ViewItemAction extends ActionSupport {

    private AccountService accountService;
    private Account account;
    private CatelogService service;
    private Item item;

    public ViewItemAction(){
        accountService=new AccountService();
        service=new CatelogService();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String execute() throws Exception {
        if (account!=null)
            account=accountService.getAccount(account.getUsername());
        item=service.getItem(item.getItemId());
        System.out.println(item.getProduct().getProductId()+item.getAttribute1()+item.getAttribute2());
        if (item==null)
            return ERROR;
        return SUCCESS;
    }
}
