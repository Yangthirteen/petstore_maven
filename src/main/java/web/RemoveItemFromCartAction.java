package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Cart;
import domain.Item;
import service.AccountService;


public class RemoveItemFromCartAction extends ActionSupport {

    private AccountService accountService;
    private Account account;
    private String cartItemId;
    private String message;
    private Cart cart;

    public RemoveItemFromCartAction(){accountService=new AccountService();}

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
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
        Item item=cart.removeItemById(cartItemId);
        if (item==null){
            message="Attempted to remove null CartItem from Cart.";
        }else {
        }
        return SUCCESS;
    }
}
