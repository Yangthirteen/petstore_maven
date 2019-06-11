package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Category;
import domain.Item;
import domain.Product;
import service.AccountService;
import service.CatelogService;

import java.util.List;

public class ViewProductAction extends ActionSupport{

    private AccountService accountService;
    private Account account;
    private CatelogService service;
    private Category category;
    private Product product;
    private List<Item> itemList;

    public ViewProductAction(){
        accountService=new AccountService();
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

        product=service.getProduct(product.getProductId());
        category=service.getCategory(product.getCategoryId());
        System.out.println(product.getCategoryId());
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
