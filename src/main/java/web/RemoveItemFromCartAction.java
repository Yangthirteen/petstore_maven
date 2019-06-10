package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Cart;
import domain.Item;


public class RemoveItemFromCartAction extends ActionSupport {

    private String cartItemId;
    private String message;
    private Cart cart;

    public RemoveItemFromCartAction(){}

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

    @Override
    public String execute() throws Exception {
        Item item=cart.removeItemById(cartItemId);
        if (item==null){
            message="Attempted to remove null CartItem from Cart.";
        }else {
        }
        return SUCCESS;
    }
}
