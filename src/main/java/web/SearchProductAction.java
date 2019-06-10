package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Product;
import service.CatelogService;

import java.util.List;

public class SearchProductAction extends ActionSupport {
    private CatelogService catelogService;
    private String keyword;
    private List<Product> productList;

    public SearchProductAction(){
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

    @Override
    public String execute() throws Exception {
        productList= catelogService.searchProductList(keyword);
        return SUCCESS;
    }
}
