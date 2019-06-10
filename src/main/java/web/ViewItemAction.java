package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Item;
import service.CatelogService;

public class ViewItemAction extends ActionSupport {

    private CatelogService service;
    private Item item;

    public ViewItemAction(){
        service=new CatelogService();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String execute() throws Exception {
        item=service.getItem(item.getItemId());
        if (item==null)
            return ERROR;
        return SUCCESS;
    }
}
