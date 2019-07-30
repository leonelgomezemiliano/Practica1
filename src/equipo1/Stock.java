
package equipo1;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    List <ItemStock> Items = new ArrayList <>();

    public List<ItemStock> getItems() {
        return Items;
    }

    public void setItems(List<ItemStock> Items) {
        this.Items = Items;
    }
    
}
