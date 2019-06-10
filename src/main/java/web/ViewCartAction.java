package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Cart;

public class ViewCartAction extends ActionSupport {

    private Cart cart;

    public ViewCartAction(){}

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String execute() throws Exception {

        if (cart==null){
            cart=new Cart();
        }
        return SUCCESS;
    }
}
