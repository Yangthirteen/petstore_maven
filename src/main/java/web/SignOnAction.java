package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import service.AccountService;

public class SignOnAction extends ActionSupport {

    private String username;
    private String password;
    private AccountService accountService;
    private boolean authenticated;
    private Account account;
    //private String code1;
    //private String code;
    private boolean flag;
    private String message;

    public SignOnAction(){accountService=new AccountService();}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getFlag(){
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    /*public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }*/

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getAuthenticated(){
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated){
        this.authenticated=authenticated;
    }

    @Override
    public String execute() throws Exception {
        account=accountService.getAccount(username,password);
        System.out.println(account.getUsername());
        //if (!code.toLowerCase().equals(code1.toLowerCase())){
        //    flag=true;
       // }else{
         //   flag=false;
            if (account==null){
                authenticated=false;
                message="Invalid username or password.  Signon failed.";
                return INPUT;
            //}else{
            //    authenticated=true;
            }
        //}
        authenticated=true;
        return SUCCESS;
    }
}
