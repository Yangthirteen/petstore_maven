package web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Category;
import domain.Product;
import service.CatelogService;

import java.util.List;

public class ViewCategoryAction extends ActionSupport implements ModelDriven {

    private CatelogService service;

    private Category category;
    private List<Product> products;

    @Override
    public Object getModel() {
        return products;
    }

    public String getProductListByCategory() throws Exception{
        if (service.getProductListByCategory(category.getCategoryId())==null){
            return ERROR;
        }

        return SUCCESS;
    }


}
