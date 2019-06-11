package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Category;
import domain.Product;
import service.CatelogService;

import java.util.List;

public class ViewCategoryAction extends ActionSupport{

    private CatelogService service;
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

    public ViewCategoryAction(){
        service=new CatelogService();
    }


    public String execute() throws Exception{
        //System.out.println(category.getCategoryId());
        category=service.getCategory(category.getCategoryId());
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
