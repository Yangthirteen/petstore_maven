package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Cart;
import domain.CartItem;
import service.AccountService;

import java.util.Iterator;

public class UpdateCartQuantitiesAction extends ActionSupport {

    private Iterator<CartItem> cartItems;
    private Cart cart;
    private String itemId;
    private AccountService accountService;
    private Account account;

    public UpdateCartQuantitiesAction(){accountService=new AccountService();}

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Iterator<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Iterator<CartItem> cartItems) {
        this.cartItems = cartItems;
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
        cartItems = cart.getAllCartItems();
        while (cartItems.hasNext()) {
            CartItem cartItem = (CartItem) cartItems.next();
            String itemId = cartItem.getItem().getItemId();
            try {
                int quantity = Integer.parseInt((String) itemId);
                cart.setQuantityByItemId(itemId, quantity);
                if (quantity < 1) {
                    cartItems.remove();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return SUCCESS;
    }
}
