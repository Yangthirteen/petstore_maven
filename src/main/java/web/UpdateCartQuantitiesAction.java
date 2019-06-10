package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Cart;
import domain.CartItem;

import java.util.Iterator;

public class UpdateCartQuantitiesAction extends ActionSupport {
    private Iterator<CartItem> cartItems;
    private Cart cart;
    private String itemId;

    public UpdateCartQuantitiesAction(){}

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

    @Override
    public String execute() throws Exception {
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
