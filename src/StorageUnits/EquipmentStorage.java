package StorageUnits;

import Modell.Equipments.Equipment;
import Modell.Item;

import java.util.ArrayList;

public abstract class EquipmentStorage extends BaseStorage{

   // private ArrayList<Equipment> Container;

    public EquipmentStorage() {
       // super(container);
    }

    public abstract void SortBySecurityLevel();
    /*
    {

        for(int i = 0; i < Container.size(); i++){
            Equipment temp;
            if(Container.get(i).getSecurityLevel() > Container.get(i + 1).getSecurityLevel()){
                temp = Container.get(i + 1);
                Container.set(i + 1, Container.get(i));
                Container.set(i, temp);
            }
        }
    }*/
}
