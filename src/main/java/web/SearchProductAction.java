package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Product;
import service.AccountService;
import service.CatelogService;

import java.util.List;

public class SearchProductAction extends ActionSupport {

    private AccountService accountService;
    private Account account;
    private CatelogService catelogService;
    private String keyword;
    private List<Product> productList;

    public SearchProductAction(){
        accountService=new AccountService();
        catelogService =new CatelogService();}

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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

    @Override
    public String execute() throws Exception {
        if (account!=null)
            account=accountService.getAccount(account.getUsername());
        productList= catelogService.searchProductList(keyword);
        return SUCCESS;
    }
}
