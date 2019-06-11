package persistence;

import domain.Item;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface ItemDAO {
    void updateInventoryQuantity(@Param(value = "itemId") String itemId, @Param(value = "increment") Integer increment);

    int getInventoryQuantity(String itemId);

    List<Item> getItemListByProduct(String productId);

    Item getItem(String itemId);
}
