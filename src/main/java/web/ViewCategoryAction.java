package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Category;
import domain.Product;
import service.AccountService;
import service.CatelogService;

import java.util.List;

public class ViewCategoryAction extends ActionSupport{

    private CatelogService service;
    private AccountService accountService;
    private Account account;
    private Category category;
    private List<Product> productList;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public ViewCategoryAction(){
        accountService=new AccountService();
        service=new CatelogService();
    }


    public String execute() throws Exception{
        if (account==null)
            System.out.println("null");
        if (account!=null)
            account=accountService.getAccount(account.getUsername());
        System.out.println(category.getCategoryId());
        category=service.getCategory(category.getCategoryId());
        //System.out.println(category.getName());
        productList=service.getProductListByCategory(category.getCategoryId());

        if (productList==null){
            return ERROR;
        }
        /*for (int i=0;i<productList.size();i++){
            System.out.println(productList.get(i).getName());
        }*/
        return SUCCESS;
    }


}
