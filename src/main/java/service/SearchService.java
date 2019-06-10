package service;


import org.apache.ibatis.session.SqlSession;
import persistence.SearchDAO;
import persistence.SqlSessionFactoryUtil;

public class SearchService {
    public SearchDAO searchDAO;

    public SearchService(){
        SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        searchDAO=session.getMapper(SearchDAO.class);
    }

    public String searchMessage(String keyword){
        return searchDAO.searchMessage(keyword);
    }
}


//搜索

