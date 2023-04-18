package StorageUnits;

import Modell.Item;
import java.util.ArrayList;

abstract public class BaseStorage{

    //private ArrayList<Item> Container;

    public BaseStorage() {
       // Container = new ArrayList<>();
    }

    abstract public void SortByQuantity();
    /*
    {
        for(int i = 0; i < Container.size(); i++){
            Item temp;
            if(Container.get(i).getQuantity() > Container.get(i + 1).getQuantity()){
                temp = Container.get(i + 1);
                Container.set(i + 1, Container.get(i));
                Container.set(i, temp);
            }
        }
    }*/

}
