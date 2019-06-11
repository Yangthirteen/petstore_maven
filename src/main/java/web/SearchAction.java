package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import service.AccountService;
import service.SearchService;

public class SearchAction extends ActionSupport {

    private AccountService accountService;
    private Account account;
    private SearchService searchService;
    private String keyword;

    public SearchAction(){
        accountService=new AccountService();
        searchService=new SearchService();}

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String execute() throws Exception {
        if (account!=null)
            account=accountService.getAccount(account.getUsername());
        //获取传值，搜索商品名称的关键字
        System.out.println(keyword);
        //查询
        String search = "";
        try {
            search = searchService.searchMessage(keyword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //search = "123#123#12";
        if(search==null) System.out.println("error");
        else System.out.println(search);
        return SUCCESS;
    }
}
