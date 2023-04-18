package StorageUnits;

import Modell.Item;
import Modell.Products.Product;

import java.util.ArrayList;

abstract public class ProductStorage extends BaseStorage{

  //  private ArrayList<Product> Container;


    public abstract void SortByPrice();

//    {
//        for(int i = 0; i < Container.size(); i++){
//            Product temp;
//            if(Container.get(i).getPrice() > Container.get(i + 1).getPrice()){
//                temp = Container.get(i + 1);
//                Container.set(i + 1, Container.get(i));
//                Container.set(i, temp);
//            }
//        }
//    }
}
