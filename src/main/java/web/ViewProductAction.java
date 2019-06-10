package web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Product;
import service.CatelogService;
import java.util.List;

public class ViewProductAction extends ActionSupport implements ModelDriven  {

    private CatelogService catelogService;
    private List<Product> product;
    private String categoryId;

    @Override
    public Object getModel() {
        if (product==null){
            product=catelogService.getProductListByCategory(categoryId);
        }
        return product;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getProductListByCategory(String categoryId) throws Exception{
        if (catelogService.getProductListByCategory(categoryId)==null){
            return ERROR;
        }else {
            return SUCCESS;
        }
    }
}
