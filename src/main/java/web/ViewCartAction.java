package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Cart;
import service.AccountService;

public class ViewCartAction extends ActionSupport {

    private AccountService accountService;
    private Account account;
    private Cart cart;

    public ViewCartAction(){accountService=new AccountService();}

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
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
        if (cart==null){
            cart=new Cart();
        }
        return SUCCESS;
    }
}
