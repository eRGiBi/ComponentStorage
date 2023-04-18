package StorageUnits;

import Modell.Item;
import Modell.Products.Notebook;

import java.util.ArrayList;

public class NotebookStorage extends ProductStorage{

    private ArrayList<Notebook> Container;

    public NotebookStorage(ArrayList<Notebook> container) {
        Container = container;
    }
    @Override
    public void SortByQuantity() {
        for(int i = 0; i < Container.size(); i++){
            Notebook temp;
            if(Container.get(i).getQuantity() > Container.get(i + 1).getQuantity()){
                temp = Container.get(i + 1);
                Container.set(i + 1, Container.get(i));
                Container.set(i, temp);
            }
        }
    }
    @Override
    public void SortByPrice() {
        for(int i = 0; i < Container.size(); i++){
            Notebook temp;
            if(Container.get(i).getPrice() > Container.get(i + 1).getPrice()){
                temp = Container.get(i + 1);
                Container.set(i + 1, Container.get(i));
                Container.set(i, temp);
            }
        }
    }
}
