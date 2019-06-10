package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import service.AccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class UsernameIsExistAction extends ActionSupport {

    private String username;
    private Account account;
    private AccountService accountService;

    public UsernameIsExistAction(){
        accountService=new AccountService();
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String usernameIsExistAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
        account.setUsername(username);
        AccountService service = new AccountService();
        System.out.println(username);
        System.out.println("   1");
        response.setContentType("text/xml");
        PrintWriter out = response.getWriter();

        if(service.usernameIsExist(account)){
            out.println("<msg>Exist</msg>");
        }
        else {
            out.println("<msg>NotExist</msg>");
        }
        out.flush();
        out.close();
        return SUCCESS;
    }
}
