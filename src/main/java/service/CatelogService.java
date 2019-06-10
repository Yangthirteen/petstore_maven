package service;

import domain.Category;
import domain.Item;
import domain.Product;
import org.apache.ibatis.session.SqlSession;
import persistence.CategoryDAO;
import persistence.ItemDAO;
import persistence.ProductDAO;
import persistence.SqlSessionFactoryUtil;
import java.util.List;

public class CatelogService {

    public CategoryDAO categoryDAO;
    public ProductDAO productDAO;
    public ItemDAO itemDAO;

    public CatelogService(){
        SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        //if (session==null)System.out.println("null");
        //SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        categoryDAO = session.getMapper(CategoryDAO.class);
        productDAO = session.getMapper(ProductDAO.class);
        itemDAO = session.getMapper(ItemDAO.class);
    }

    public List<Category> getCategoryList() {
        return categoryDAO.getCategoryList();
    }

    public Category getCategory(String categoryId) {
        return categoryDAO.getCategory(categoryId);
    }

    public Product getProduct(String productId) {
        return productDAO.getProduct(productId);
    }

    public List<Product> getProductListByCategory(String categoryId) {
        return productDAO.getProductListByCategory(categoryId);
    }

    // TODO enable using more than one keyword
    public List<Product> searchProductList(String keyword) {
        return productDAO.searchProductList("%" + keyword.toLowerCase() + "%");
    }


    public List<Item> getItemListByProduct(String productId) {
        return itemDAO.getItemListByProduct(productId);
    }

    public Item getItem(String itemId) {
        return itemDAO.getItem(itemId);
    }

    public boolean isItemInStock(String itemId) {
        return itemDAO.getInventoryQuantity(itemId) > 0;
    }
}
