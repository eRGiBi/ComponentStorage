package StorageUnits;

import Modell.Equipments.Glove;
import Modell.Item;

import java.util.ArrayList;

public class GloveStorage extends EquipmentStorage
{
    private ArrayList<Glove> Container;
    public GloveStorage(ArrayList<Glove> container) {
        Container = container;
    }

    @Override
    public void SortByQuantity() {
        for(int i = 0; i < Container.size(); i++){
            Glove temp;
            if(Container.get(i).getQuantity() > Container.get(i + 1).getQuantity()){
                temp = Container.get(i + 1);
                Container.set(i + 1, Container.get(i));
                Container.set(i, temp);
            }
        }
    }
    @Override
    public void SortBySecurityLevel() {
        for(int i = 0; i < Container.size(); i++){
            Glove temp;
            if(Container.get(i).getSecurityLevel() > Container.get(i + 1).getSecurityLevel()){
                temp = Container.get(i + 1);
                Container.set(i + 1, Container.get(i));
                Container.set(i, temp);
            }
        }
    }
}
