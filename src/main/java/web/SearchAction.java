package web;

import com.opensymphony.xwork2.ActionSupport;
import service.SearchService;

public class SearchAction extends ActionSupport {

    private SearchService searchService;
    private String keyword;

    public SearchAction(){searchService=new SearchService();}

    @Override
    public String execute() throws Exception {
        //获取传值，搜索商品名称的关键字
        System.out.println(keyword);
        //查询
        SearchService service = new SearchService();
        String search = "";
        try {
            search = service.searchMessage(keyword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //search = "123#123#12";
        if(search==null) System.out.println("error");
        else System.out.println(search);
        return SUCCESS;
    }
}
