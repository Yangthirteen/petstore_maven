package persistence;

import domain.Category;
import java.util.List;

public interface CategoryDAO {
    List<Category> getCategoryList();

    Category getCategory(String categoryId);
}
