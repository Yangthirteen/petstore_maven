package web;

import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport {

    public MainAction(){}

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
