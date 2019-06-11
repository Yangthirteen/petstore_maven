package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Item;
import domain.Product;
import service.CatelogService;

import java.util.List;

public class ViewProductAction extends ActionSupport{

    private CatelogService service;
    private Product product;
    private List<Item> itemList;

    public ViewProductAction(){
        service=new CatelogService();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String execute() throws Exception {
        //System.out.println(product.getProductId());
        product=service.getProduct(product.getProductId());
        itemList=service.getItemListByProduct(product.getCategoryId());
        /*for (int i=0;i<itemList.size();i++){
            System.out.println(itemList.get(i).getItemId());
        }*/
        if (itemList==null){
            return ERROR;
        }
        return SUCCESS;
    }
}
