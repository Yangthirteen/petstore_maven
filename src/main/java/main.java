import domain.Item;
import service.CatelogService;

import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Item> itemList;
        CatelogService service=new CatelogService();
        itemList=service.getItemListByProduct("FI-FW-01");
        for (int i=0;i<itemList.size();i++){
            System.out.println(itemList.get(i).getItemId());
        }
    }
}
