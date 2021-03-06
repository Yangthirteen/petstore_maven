package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Cart;
import service.AccountService;
import service.CatelogService;
import service.UserActionService;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddItemToCartAction extends ActionSupport {
    private String workingItemId;
    private Cart cart;
    private Account account;
    private AccountService accountService;
    private UserActionService userActionService;
    private CatelogService catelogService;

    public AddItemToCartAction(){
        userActionService=new UserActionService();
        catelogService =new CatelogService();
        accountService=new AccountService();
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getWorkingItemId() {
        return workingItemId;
    }

    public void setWorkingItemId(String workingItem) {
        this.workingItemId = workingItem;
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
        Date currentData=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        String date = sdf.format(currentData);
        if (account==null)
            return LOGIN;
        account=accountService.getAccount(account.getUsername());
        userActionService.record(account.getUsername(),"add item to cart ",workingItemId,date);
        return SUCCESS;
    }
}
