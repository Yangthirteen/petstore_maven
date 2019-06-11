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
    public ViewProductAction(){
        service=new CatelogService();
    }


    @Override
    public String execute() throws Exception {

        product=service.getProduct(product.getProductId());
        //System.out.println(product.getCategoryId());
        //System.out.println(product.getName());
        itemList=service.getItemListByProduct(product.getProductId());

        for (int i=0;i<itemList.size();i++){
            System.out.println(itemList.get(i).getListPrice());
        }
        if (itemList==null){
            return ERROR;
        }
        return SUCCESS;
    }
}
