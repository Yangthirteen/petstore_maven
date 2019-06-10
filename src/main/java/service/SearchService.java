package service;


import persistence.SearchDAO;

public class SearchService {
    public SearchDAO searchDAO;

    public SearchService(){
    }

    public String searchMessage(String keyword){
        return searchDAO.searchMessage(keyword);
    }
}


//搜索

