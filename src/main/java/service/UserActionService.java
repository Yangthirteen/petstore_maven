package service;

import org.apache.ibatis.session.SqlSession;
import persistence.SqlSessionFactoryUtil;
import persistence.UserActionDAO;

import java.sql.Date;
import java.sql.Time;

public class UserActionService {

    private UserActionDAO userActionDAO;

    public UserActionService(){
        SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        userActionDAO=session.getMapper(UserActionDAO.class);
    }

    public void record(String username,String action, String object, String date){
        userActionDAO.recordAction(username,action, object, date);
    }
}
