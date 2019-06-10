package service;

import persistence.UserActionDAO;

import java.sql.Date;
import java.sql.Time;

public class UserActionService {

    private UserActionDAO userActionDAO;

    public UserActionService(){

    }

    public void record(String username,String action, String object, String date){
        userActionDAO.recordAction(username,action, object, date);
    }
}
