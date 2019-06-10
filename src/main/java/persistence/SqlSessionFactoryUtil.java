package persistence;

import domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;

public class SqlSessionFactoryUtil {

    private static SqlSessionFactory sf= null;
    private static String resource = "mybatis-config.xml";

    public static SqlSessionFactory getSqlSessionFactory(){
        if (sf == null){
            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sf = new SqlSessionFactoryBuilder().build(inputStream);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

        return sf;
    }

    public static void main(String[] args) {
        getSqlSessionFactory();
    }

    /*public static void main(String[] args) {

        Account login = new Account();
        login.setUsername("admin");
        login.setPassword("1234567");

        SqlSession sqlSession = getSqlSessionFactory().openSession();

        AccountDAO accountDAO = sqlSession.getMapper(AccountDAO.class);

        Account result = accountDAO.selectAccountByUsernameAndPassword(login);

        System.out.println(result.getId());
    }*/
}
